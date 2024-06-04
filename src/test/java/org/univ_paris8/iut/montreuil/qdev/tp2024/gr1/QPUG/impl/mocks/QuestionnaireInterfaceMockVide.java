package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.impl.mocks;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.exceptions.QuestionnaireManquantException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.models.QuestionnaireInterface;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.utils.exceptions.FichierInaccessibleException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.utils.exceptions.FichierManquantException;

public class QuestionnaireInterfaceMockVide implements QuestionnaireInterface {
    public QuestionnaireDTO chargerQuestionnaire(String cheminVersFichierCSV, int idQuestionnaire) throws FichierInaccessibleException, FichierManquantException, QuestionnaireManquantException {
        throw new QuestionnaireManquantException("Questionnaire manquant");
    }

    //public QuestionBO getQuestionBO() {} ;
    //public QuestionnaireDTO createQuestionnaire(){} ;
    //public void setQuestionNbFoisRéussie(int) {} ;
    //public int getQuestionNbFoisRéussie() {} ;
    //public String getQuestionLangue() {} ;
    //public int getNbFoisJoué() {} ;
    //public void setNbFoisJoué (int) {} ;


    /*
     public ServiceJoueurSimpleMockOk() {
    }

    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeDeNaissance, LanguesEnum langue, String centreDInteretListe) {

        return new JoueurDTO("joueurSimple", "pseudoSimple", 2003, LanguesEnum.FRANCAIS, "bowling, manga");
    }

    @Override
    public ArrayList<JoueurDTO> listerJoueur() {
        return null;
    }

    @Override
    public boolean supprimerJoueur(String pseudo) {
        return true;
    }
     */
}