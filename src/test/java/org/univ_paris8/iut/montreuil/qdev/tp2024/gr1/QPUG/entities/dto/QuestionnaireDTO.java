package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.QPUG.entities.dto;

import java.util.ArrayList;
import java.util.Objects;

public class QuestionnaireDTO {
    private int idQuestionnaire;
    private ArrayList<QuestionDTO> listeQuestionsDTO;

    public QuestionnaireDTO(int idQuestionnaire){
        this.listeQuestionsDTO = new ArrayList<QuestionDTO>();
    }

    public int getNbQuestions(){
        return this.listeQuestionsDTO.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionnaireDTO that = (QuestionnaireDTO) o;
        return idQuestionnaire == that.idQuestionnaire && Objects.equals(listeQuestionsDTO, that.listeQuestionsDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idQuestionnaire, listeQuestionsDTO);
    }
}
