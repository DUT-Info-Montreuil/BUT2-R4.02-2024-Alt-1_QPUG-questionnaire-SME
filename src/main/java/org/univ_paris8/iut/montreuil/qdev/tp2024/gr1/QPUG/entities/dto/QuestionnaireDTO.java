package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.entities.dto;

import java.util.ArrayList;

public class QuestionnaireDTO {
    private int idQuestionnaire;
    private ArrayList<QuestionDTO> listeQuestionsDTO;

    public QuestionnaireDTO(int idQuestionnaire){
        this.listeQuestionsDTO = new ArrayList<QuestionDTO>();
        this.idQuestionnaire = idQuestionnaire;
    }

    public int getNbQuestions(){
        return this.listeQuestionsDTO.size();
    }
    public void addQuestionDTO(QuestionDTO questionDTO){this.listeQuestionsDTO.add(questionDTO);}
}
