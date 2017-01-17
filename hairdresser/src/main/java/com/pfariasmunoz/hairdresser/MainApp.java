package com.pfariasmunoz.hairdresser;

import com.pfariasmunoz.hairdresser.model.entities.Employee;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class MainApp {
    
    private static SessionFactory sessionFactory;

 
    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        

        sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();
        
        
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
        
        //launch(args);
    }

}
