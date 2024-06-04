package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.models;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.utils.exceptions.FichierInaccessibleException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.utils.exceptions.FichierManquantException;

public interface QuestionnaireInterface {
    public QuestionnaireDTO chargerQuestionnaire(String cheminVersFichierCSV, int i) throws Exception;

    //public QuestionBO getQuestionBO() {} ;
    //public QuestionnaireDTO createQuestionnaire(){} ;
    //public void setQuestionNbFoisRéussie(int) {} ;
    //public int getQuestionNbFoisRéussie() {} ;
    //public String getQuestionLangue() {} ;
    //public int getNbFoisJoué() {} ;
    //public void setNbFoisJoué (int) {} ;
}
