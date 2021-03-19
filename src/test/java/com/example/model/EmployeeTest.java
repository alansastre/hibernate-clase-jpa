package com.example.model;

import com.example.util.JpaUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

import java.time.Instant;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {


    EntityManager manager;

    @Test
    @DisplayName("findAllEmployees")
    public void findAllEmployees() {

        manager = JpaUtil.getEntityManager();

        List<Employee> employees = manager.createQuery("select e from Employee e").getResultList();
        System.out.println(employees);

        manager.close();
    }

    @Test
    @DisplayName("Test name")
    public void testName() {

        manager = JpaUtil.getEntityManager();

        Employee employee = new Employee("Juan",40,true,40000D, Instant.now());

        manager.getTransaction().begin();
        manager.persist(employee);
        manager.getTransaction().commit();

        manager.close();

    }



}