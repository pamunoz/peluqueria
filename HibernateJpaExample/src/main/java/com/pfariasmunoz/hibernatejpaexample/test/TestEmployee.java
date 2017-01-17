/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfariasmunoz.hibernatejpaexample.test;

import com.pfariasmunoz.hibernatejpaexample.model.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pablo
 */
public class TestEmployee {
    
    private static EntityManager manager;
    private static EntityManagerFactory emf;
    
    public static void main(String[] args) {
        /* Crear el gestor de persistencia (EM). */
        emf = Persistence.createEntityManagerFactory("application");
        manager = emf.createEntityManager();
        
        List<Employee> employeeList = (List<Employee>) manager.createQuery("from Employee").getResultList();
        System.out.println("In this db there are: " + employeeList.size() + " employees.");
        
    }
    
}
