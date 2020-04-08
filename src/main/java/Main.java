import lt.codeacademy.entities.Answer;
import lt.codeacademy.entities.Exam;
import lt.codeacademy.entities.Person;
import lt.codeacademy.entities.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            Answer exam= (Answer) session.get(Answer.class,2);
            System.out.println(exam.toString());
            tx.commit();

        } catch (Exception e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

    }
}
