package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.exceptions.*;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.impl.mocks.QuestionnaireInterfaceMockManquant;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.impl.mocks.QuestionnaireInterfaceMockOk;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.impl.mocks.QuestionnaireInterfaceMockQuestionnaireInaccessible;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.impl.mocks.QuestionnaireInterfaceMockVide;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.impl.mocks.*;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.models.QuestionnaireInterface;

public class ServiceImportationQuestionnaireTest {

    private QuestionnaireInterface serviceQuestionnaireImportImpl;

    @BeforeEach
    void setUp(TestInfo testInfo) throws Exception {

        serviceQuestionnaireImportImpl = null;

        System.out.println("test " + testInfo.getDisplayName());
    }

    @Test
    // test 1
    void getQuestionnairevalideTest() {
        // MOCK à supprimer lors de l'ajout du vrai service
        serviceQuestionnaireImportImpl = new QuestionnaireInterfaceMockOk();

        QuestionnaireDTO questionnaireAttendu = new QuestionnaireDTO(7);
        try{
            QuestionnaireDTO questionaireResultat = serviceQuestionnaireImportImpl.chargerQuestionnaire("src/test/java/org/univ_paris8/iut/montreuil/qdev/tp2024/gr1/QPUG/entities/bo/questionsQuizz_V1.1.csv",1);
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

    @Test
    // Test 2
    void getQuestionnaireVideTest(){
        // MOCK à supprimer lors de l'ajout du vrai service
        serviceQuestionnaireImportImpl = new QuestionnaireInterfaceMockVide();

        try{
            // Vérifier que l'importation lance une FichierVideException
            QuestionnaireManquantException exception = assertThrows(QuestionnaireManquantException.class, () -> {
                serviceQuestionnaireImportImpl.chargerQuestionnaire("src/test/java/org/univ_paris8/iut/montreuil/qdev/tp2024/gr1/QPUG/entities/bo/FichierVide.csv", 1);
            });

        }
        catch (Exception e){
            System.out.println("Erreur inattendu dans le test getQuestionnairevalideTest");
        }

    }

    @Test
        // Test 3
    void getQuestionnaireManquantTest(){
        // MOCK à supprimer lors de l'ajout du vrai service
        serviceQuestionnaireImportImpl = new QuestionnaireInterfaceMockManquant();

        try{
            // Vérifier que l'importation lance une FichierVideException
            FichierManquantException FichierManquantException = assertThrows(FichierManquantException.class, () -> {
                serviceQuestionnaireImportImpl.chargerQuestionnaire("src/test/java/org/univ_paris8/iut/montreuil/qdev/tp2024/gr1/QPUG/entities/bo/FichierManquant.csv", 1);
            });

        }
        catch (Exception e){
            System.out.println("Erreur inattendu dans le test getQuestionnairevalideTest");
        }

    }

    @Test
        // Test 4
    // quand le quesionnaire demandé dans le fichier n'existe pas
    void getQuestionnaireInexistantTest(){
        // MOCK à supprimer lors de l'ajout du vrai service
        serviceQuestionnaireImportImpl = new QuestionnaireInterfaceMockQuestionnaireInaccessible();

        try{
            // Vérifier que l'importation lance une FichierVideException
            FichierInaccessibleException FichierInaccException = assertThrows(FichierInaccessibleException.class, () -> {
                serviceQuestionnaireImportImpl.chargerQuestionnaire("src/test/java/org/univ_paris8/iut/montreuil/qdev/tp2024/gr1/QPUG/entities/bo/FichierQuestionnaireInexistant.csv", 7);
            });

        }
        catch (Exception e){
            System.out.println("Erreur inattendu dans le test getQuestionnairevalideTest");
        }

    }
    @Test
        // Test 5
        // quand toutes les colonnes ne sont pas remplies
    void getQuestionnaireDonneesManquantesTest(){
        // MOCK à supprimer lors de l'ajout du vrai service
        serviceQuestionnaireImportImpl = new QuestionnaireInterfaceMockDonneesManquantes();

        try{
            // Vérifier que l'importation lance une FichierVideException
            DonneesManquantesException FichierInaccException = assertThrows(DonneesManquantesException.class, () -> {
                serviceQuestionnaireImportImpl.chargerQuestionnaire("src/test/java/org/univ_paris8/iut/montreuil/qdev/tp2024/gr1/QPUG/entities/bo/FichierDonneesManquante.csv", 1);
            });

        }
        catch (Exception e){
            System.out.println("Erreur inattendu dans le test getQuestionnairevalideTest");
        }

    }

}