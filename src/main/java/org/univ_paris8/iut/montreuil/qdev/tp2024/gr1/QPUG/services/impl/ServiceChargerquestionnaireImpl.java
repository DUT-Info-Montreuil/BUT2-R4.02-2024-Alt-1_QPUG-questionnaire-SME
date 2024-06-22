package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.services.impl;

import com.opencsv.CSVReader;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.entities.bo.QuestionBO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.services.models.QuestionnaireInterface;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.utils.exceptions.DonneesManquantesException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.utils.exceptions.FichierIllisibleException;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.utils.exceptions.FichierManquantException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.utils.exceptions.QuestionnaireManquantException;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class ServiceChargerquestionnaireImpl implements QuestionnaireInterface {
    @Override
    public ArrayList<QuestionnaireDTO> chargerQuestionnaire(String cheminVersFichierCSV) throws FichierIllisibleException, FichierManquantException, DonneesManquantesException {
        File file = new File(cheminVersFichierCSV);
        if (cheminVersFichierCSV.length() == 0 || !file.exists())
            throw new FichierManquantException("Rentrez le bon chemin de fichier : chemin vide ou fichier inexistant.");
        ArrayList<QuestionnaireDTO> listeQuestionnairesDTO = new ArrayList<>() ;
        try(CSVReader reader = new CSVReader(new FileReader(cheminVersFichierCSV))){
            List<String[]> lettreSuivante;

            lettreSuivante= reader.readAll();
            int idQuestionnaire = Integer.parseInt(lettreSuivante.get(0)[0]);
            QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(idQuestionnaire);

            for (int ligne=0; ligne<lettreSuivante.size(); ligne++){
                if (Integer.parseInt(lettreSuivante.get(ligne)[0]) != idQuestionnaire) {
                    listeQuestionnairesDTO.add(questionnaireDTO);
                    idQuestionnaire = Integer.parseInt(lettreSuivante.get(ligne)[0]);
                    questionnaireDTO = new QuestionnaireDTO(idQuestionnaire);
                }
                QuestionBO q = new QuestionBO(lettreSuivante.get(ligne));
                String[] q2 = q.getQuestionBO();
                if ( q2.length != 8){
                    throw new DonneesManquantesException("Il y a des données manquantes");
                }
                QuestionDTO questionDTO = new QuestionDTO(Integer.parseInt(q2[0]),Integer.parseInt(q2[1]),q2[2],q2[3],q2[4],q2[5],q2[6],q2[7]);
                questionnaireDTO.addQuestionDTO(questionDTO);

            }
            if (questionnaireDTO.getNbQuestions() < 1) {
                throw new QuestionnaireManquantException("Le questionnaire que vous essayez de charger n'existe pas dans le fichier.");
            }else{
                listeQuestionnairesDTO.add(questionnaireDTO);
            }
            return listeQuestionnairesDTO;

        }catch(Exception e){
            throw new FichierIllisibleException("Fichier illisible.");
        }
    }
}
