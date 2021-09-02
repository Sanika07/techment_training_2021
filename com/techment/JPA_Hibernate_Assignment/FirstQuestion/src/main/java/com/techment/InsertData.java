package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("techment");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();
        
//        Author au1 = new Author(1, "ram", "kumar", "verma", 913198763);
//        Author au2 = new Author(1, "sachin", "kumar", "soni", 913648373);
        
        Author au1 = new Author();
        au1.setId(3);
        au1.setFirstName("mahendra");
        au1.setMiddleName("singh");
        au1.setLastName("dhoni");
        au1.setNumber(913198763);
        
        em.persist(au1);
        
        Author au2 = new Author();
        au2.setId(4);
        au2.setFirstName("raj");
        au2.setMiddleName("kumar");
        au2.setLastName("yadav");
        au2.setNumber(913648373);
        
        em.persist(au2);
        
        em.getTransaction().commit();  
        
        emf.close();  
        em.close();  

	}

}
