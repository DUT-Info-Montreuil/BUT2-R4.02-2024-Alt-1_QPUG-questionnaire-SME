package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.entities.dto;

public class QuestionDTO {

    private int nbFoisRéussie;
    private int idQuestionnaire;
    private int numQuestionnaire;
    private String langue;
    private String libellé;
    private String réponse;
    private String difficulté;
    private String explication;
    private String référence;
    public QuestionDTO(int idQuestionnaire, int numQuestionnaire, String langue, String libellé, String réponse, String difficulté, String explication, String référence){
        this.nbFoisRéussie=0;
        this.idQuestionnaire = idQuestionnaire;
        this.numQuestionnaire=numQuestionnaire;
        this.langue=langue;
        this.libellé=libellé;
        this.réponse=réponse;
        this.difficulté=difficulté;
        this.explication=explication;
        this.référence=référence;
    }




}
