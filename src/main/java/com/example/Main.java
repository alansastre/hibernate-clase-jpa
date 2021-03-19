package com.example;

import com.example.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * JPA - JAVA PERSISTENCE API - Java EE (especificación, conjunto de interfaces y clases)
 *
 * Implementaciones de JPA:
 *
 * Hibernate
 * Eclipse Toplink
 *
 */
public class Main {

    public static void main(String[] args) {


        // Uso sin JpaUtil
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernate-clase-jpa");
        EntityManager manager = factory.createEntityManager();

        List<Employee> employees = manager.createQuery("select e from Employee e").getResultList();
        System.out.println(employees);

        manager.close();


    }
}
