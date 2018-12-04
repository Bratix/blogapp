package models;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserLogin {

    public static boolean isValid(String name, String password){
        boolean validation;
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        if (entityManager.createQuery("select id from User where name ='"+ name +"' and password = '"+ password+"'").getResultList().isEmpty())
            validation = false;
        else
            validation = true;

        System.out.println(validation);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();

        return validation;
    }

    public static void addUser(String name, String password){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        User user = new User(name,password);
        entityManager.persist(user);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();
    }

}
