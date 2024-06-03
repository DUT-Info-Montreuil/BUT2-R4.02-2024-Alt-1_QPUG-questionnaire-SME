package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.impl.mocks;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.exceptions.DonneesManquantesException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.exceptions.FichierInaccessibleException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.exceptions.FichierManquantException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.exceptions.QuestionnaireManquantException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.models.QuestionnaireInterface;


public class QuestionnaireInterfaceMockDonneesManquantes implements QuestionnaireInterface {
    public QuestionnaireDTO chargerQuestionnaire(String cheminVersFichierCSV, int idQuestionnaire) throws FichierInaccessibleException, FichierManquantException, QuestionnaireManquantException, DonneesManquantesException {
        throw new DonneesManquantesException("données manquantes");
    }

}
