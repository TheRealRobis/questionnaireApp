package lt.codeacademy.entities;

import javax.persistence.*;

@Entity
@Table(name = "person_answers")
public class PersonAnswers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "question_id")
    private int questionId;
    @Column(name = "answer_id")
    private int answerId;
    @Column(name = "result_id")
    private int resultId;

    public PersonAnswers() {
    }

    @Override
    public String toString() {
        return "PersonAnswers{" +
                "questionId=" + questionId +
                ", answerId=" + answerId +
                ", resultId=" + resultId +
                '}';
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }
}
