package lt.codeacademy.entities;


import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    private int id;
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    @Column(name = "name")
    private String firstName;
    @Column(name = "password")
    private String password;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person() {
    }


}
