package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.impl.mocks;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.utils.exceptions.*;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.services.models.QuestionnaireInterface;


public class QuestionnaireInterfaceMockDonneesManquantes implements QuestionnaireInterface {
    public QuestionnaireDTO chargerQuestionnaire(String cheminVersFichierCSV, int idQuestionnaire) throws FichierIllisibleException, FichierManquantException, QuestionnaireManquantException, DonneesManquantesException {
        throw new DonneesManquantesException("données manquantes");
    }

}
