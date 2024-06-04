package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.impl.mocks;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.utils.exceptions.*;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.services.models.QuestionnaireInterface;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.utils.exceptions.QuestionnaireManquantException;

public class QuestionnaireInterfaceMockQuestionnaireInaccessible implements QuestionnaireInterface {
    public QuestionnaireDTO chargerQuestionnaire(String cheminVersFichierCSV, int idQuestionnaire) throws FichierIllisibleException, FichierManquantException, QuestionnaireManquantException {
        throw new FichierIllisibleException("Questionnaire inexistant à l'interieur du fichier");
    }

}
