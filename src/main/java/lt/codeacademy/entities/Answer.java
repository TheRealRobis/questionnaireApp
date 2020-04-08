package lt.codeacademy.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Answer")
public class Answer {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "question_id")
    private int questionId;
    @Column(name = "correct")
    private boolean correct;
    @Column(name = "text")
    private String text;
    @Column(name = "option")
    private char option;

    public Answer() {
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", questionId=" + questionId +
                ", correct=" + correct +
                ", text='" + text + '\'' +
                ", option=" + option +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public char getOption() {
        return option;
    }

    public void setOption(char option) {
        this.option = option;
    }
}
