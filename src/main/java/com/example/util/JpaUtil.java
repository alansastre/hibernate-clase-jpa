package com.example.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {


    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = // equivalencia SessionFactory
            Persistence.createEntityManagerFactory("hibernate-clase-jpa");

    public static EntityManager getEntityManager(){ // equivalencia Session
        return ENTITY_MANAGER_FACTORY.createEntityManager();
    }

}
