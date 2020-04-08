package lt.codeacademy.db;

import lt.codeacademy.entities.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class DbManager {

    SessionFactory sessionFactory = new Configuration()
            .configure()
            .buildSessionFactory();

    public Person fetchPerson(String name, String password) {
        Session session = sessionFactory.openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Person> cr = cb.createQuery(Person.class);
        Root<Person> root = cr.from(Person.class);
        Predicate namePredicate = cb.equal(root.get("name"), name);
        Predicate passwordPredicate= cb.equal(root.get("password"), password);
        cr.select(root).where(namePredicate,passwordPredicate);
        Query<Person> query = session.createQuery(cr);
        Person person = query.getSingleResult();
        session.close();
        return person;
    }
}
