package lt.codeacademy.services;

import lt.codeacademy.db.DbManager;
import lt.codeacademy.entities.Person;

public class AppService {

    private final DbManager dbManager = new DbManager();

    public Person loginPerson(String name, String password){
       Person person = dbManager.fetchPerson(name,password);
       return person;
    }

}
