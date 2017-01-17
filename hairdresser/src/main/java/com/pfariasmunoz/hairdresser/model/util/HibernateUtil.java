/*
 * Copyright (C) 2017 Your Organisation
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.pfariasmunoz.hairdresser.model.util;

import com.pfariasmunoz.hairdresser.model.entities.Employee;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author pablo
 */
public class HibernateUtil {
    
    private SessionFactory sessionFactory;
    
    public void setUp() throws Exception {
        
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() // configures settings from hibernate.cfg.xml
				.build();
        try {
                sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
        }
        catch (Exception e) {
                // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
                // so destroy it manually.
                StandardServiceRegistryBuilder.destroy( registry );
        }
        
    }
    
    public void finishTransaction() {
        if (sessionFactory != null) {
            sessionFactory.close();
            System.out.println("The SESSION HAS ENDED");
        }
    }
    
    public void testBasicUsage() {
        // create a couple of events...
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        System.out.println("The SESSION HAS BEGUN");
        
        Employee pablo = new Employee();
        pablo.setmFirstName("Pablo");
        pablo.setmLastName("Farias");
        
        Employee cris = new Employee();
        cris.setmFirstName("Crstopher");
        cris.setmLastName("Rojas");
        session.save(cris);
        
       
        session.getTransaction().commit();
        session.close();
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        System.out.println("The SESSION HAS BEGUN");
        
        List result = session.createQuery("from Employee").list();
        for (Employee employee : (List<Employee>) result) {
            System.out.println("Employee: " + employee.getmFirstName() + " y apellido: " + employee.getmLastName());
        }
        
        session.getTransaction().commit();
        session.close();

    }
    
}
