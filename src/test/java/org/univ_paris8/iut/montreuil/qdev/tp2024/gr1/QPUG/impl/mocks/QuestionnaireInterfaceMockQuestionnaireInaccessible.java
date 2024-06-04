package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.impl.mocks;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.models.QuestionnaireInterface;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.exceptions.*;


public class QuestionnaireInterfaceMockQuestionnaireInaccessible implements QuestionnaireInterface {
    public QuestionnaireDTO chargerQuestionnaire(String cheminVersFichierCSV, int idQuestionnaire) throws FichierInaccessibleException, FichierManquantException, QuestionnaireManquantException {
        throw new FichierInaccessibleException("Questionnaire inexistant à l'interieur du fichier");
    }

}
