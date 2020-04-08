package lt.codeacademy.entities;

import javax.persistence.*;

@Entity
@Table(name = "exam")
public class Exam {
    @Id
    private int id;
    @Column(name = "subject")
    private String subject;

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Exam() {
    }
}
