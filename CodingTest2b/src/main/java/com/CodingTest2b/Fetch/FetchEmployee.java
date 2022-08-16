package com.CodingTest2b.Fetch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.CodingTest2b.Employee.*;

public class FetchEmployee {

	public static void main(String[] args) {
		
	    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_Details");

	    EntityManager em=emf.createEntityManager();

	    em.getTransaction().begin();

	    EmployeeDetail s1=new EmployeeDetail();  
        s1.setE_num(101);  
        s1.setE_name("Amar");  
        s1.setE_desig("Head");
        s1.setE_sal(10000);
        
	    EmployeeDetail s2=new EmployeeDetail();  
        s1.setE_num(102);  
        s1.setE_name("Akbar");  
        s1.setE_desig("Staff");
        s1.setE_sal(8000);
        
	    EmployeeDetail s3=new EmployeeDetail();  
        s1.setE_num(103);  
        s1.setE_name("Anthony");  
        s1.setE_desig("Peon");
        s1.setE_sal(5000);
        
        em.persist(s1);  
        em.persist(s2);  
        em.persist(s3);       
  
em.getTransaction().commit();  
          
        emf.close();  
        em.close();  
        
        EmployeeDetail s=em.find(EmployeeDetail.class,103);  
        System.out.println("Details of '103' Employee");  
        System.out.println("Employee no. = "+s.getE_num());  
        System.out.println("Employee Name = "+s.getE_name());  
        System.out.println("Employee Designation = "+s.getE_desig()); 
        System.out.println("Employee Salary = "+s.getE_sal()); 
	}

}
