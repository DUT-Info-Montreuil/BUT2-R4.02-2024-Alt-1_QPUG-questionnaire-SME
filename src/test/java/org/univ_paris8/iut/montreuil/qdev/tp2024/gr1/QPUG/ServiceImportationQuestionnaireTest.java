package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.impl.mocks.QuestionnaireInterfaceMockOk;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.models.QuestionnaireInterface;

public class ServiceImportationQuestionnaireTest {

    private QuestionnaireInterface serviceQuestionnaireImportImpl;

    @BeforeEach
    void setUp(TestInfo testInfo) throws Exception {

        serviceQuestionnaireImportImpl = null;

        System.out.println("test " + testInfo.getDisplayName());
    }

    @Test
    // test 2
    void getQuestionnairevalideTest() {
        // MOCK à supprimer lors de l'ajout du vrai service
        serviceQuestionnaireImportImpl = new QuestionnaireInterfaceMockOk();

        QuestionnaireDTO questionnaireAttendu = new QuestionnaireDTO(7);
        try{
            QuestionnaireDTO questionaireResultat = serviceQuestionnaireImportImpl.chargerQuestionnaire("cheminFichier",7);
            assertEquals(questionnaireAttendu, questionaireResultat, "chargement d'un questionnaire valide");
        }
        catch (Exception e){
            System.out.println("Erreur inattendu dans le test getQuestionnairevalideTest");
        }
        /*JoueurDTO joueurAttendu = new JoueurDTO("joueurSimple", "pseudoSimple", 2003, LanguesEnum.FRANCAIS, "bowling, manga");
        try {
            JoueurDTO joueurResultat = serviceJoueurBeanImpl.ajouterJoueur("joueurSimple", "pseudoSimple", 2003, LanguesEnum.FRANCAIS, "bowling, manga");
            System.out.println("JoueurAttendu : "+joueurAttendu);
            System.out.println("joueurResultat: "+joueurResultat);
            assertEquals(joueurAttendu,joueurResultat,"Insertion d'un joueur classique");
        }
        catch (Exception e) {
            System.out.println("Erreur inattendu dans le test ajouterJoueurSimpleOKTest");
        }*/
    }
}
