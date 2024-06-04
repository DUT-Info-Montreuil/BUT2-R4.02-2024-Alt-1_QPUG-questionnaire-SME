package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.impl.mocks;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.utils.exceptions.*;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.services.models.QuestionnaireInterface;

public class QuestionnaireInterfaceMockManquant implements QuestionnaireInterface {
    public QuestionnaireDTO chargerQuestionnaire(String cheminVersFichierCSV, int idQuestionnaire) throws FichierInaccessibleException, FichierManquantException {
        throw new FichierManquantException("fichier manquant");
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
