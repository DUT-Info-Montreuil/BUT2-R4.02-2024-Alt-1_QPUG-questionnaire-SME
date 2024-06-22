package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.services.models;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.utils.exceptions.DonneesManquantesException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.utils.exceptions.FichierIllisibleException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.utils.exceptions.*;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.utils.exceptions.QuestionnaireManquantException;

import java.util.ArrayList;

public interface QuestionnaireInterface {
    public ArrayList<QuestionnaireDTO> chargerQuestionnaire(String cheminVersFichierCSV) throws FichierIllisibleException, FichierManquantException, DonneesManquantesException;

    //public QuestionBO getQuestionBO() {} ;
    //public QuestionnaireDTO createQuestionnaire(){} ;
    //public void setQuestionNbFoisRéussie(int) {} ;
    //public int getQuestionNbFoisRéussie() {} ;
    //public String getQuestionLangue() {} ;
    //public int getNbFoisJoué() {} ;
    //public void setNbFoisJoué (int) {} ;
}
