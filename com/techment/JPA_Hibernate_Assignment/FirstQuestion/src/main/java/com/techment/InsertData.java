package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertData {

	public static void main(String[] args) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("techment");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();
        
        Author au1 = new Author();
        au1.setId(1);
        au1.setFirstName("mahendra");
        au1.setMiddleName("singh");
        au1.setLastName("dhoni");
        au1.setNumber(913198763);
        
        em.persist(au1);
        
        Author au2 = new Author();
        au2.setId(2);
        au2.setFirstName("raj");
        au2.setMiddleName("kumar");
        au2.setLastName("yadav");
        au2.setNumber(913648373);
        
        em.persist(au2);
        
	Author au3 = new Author();
        au3.setId(3);
        au3.setFirstName("sachin");
        au3.setMiddleName("kumar");
        au3.setLastName("yadav");
        au3.setNumber(917648673);
        
        em.persist(au3);
		
	Author au4 = new Author();
        au4.setId(4);
        au4.setFirstName("shiva");
        au4.setMiddleName("kumar");
        au4.setLastName("yadav");
        au4.setNumber(919888373);
        
        em.persist(au4);
        em.getTransaction().commit();  
        
        emf.close();  
        em.close();  

	}

}
