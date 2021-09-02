package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Delete {

	public static void main(String[] args) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("techment");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();
        
        Author a = em.find(Author.class, 4);
        em.remove(a);  
        em.getTransaction().commit();  
        emf.close();  
        em.close(); 

	}

}
