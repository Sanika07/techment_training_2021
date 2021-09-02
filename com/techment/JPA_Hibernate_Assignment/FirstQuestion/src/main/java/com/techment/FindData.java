package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Find {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("techment");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();
        
        Author a = em.find(Author.class, 3);
        System.out.println("===Author Found!!===");  
        System.out.println("Author Id: "+a.getId());
        System.out.println("Author's first name:  "+a.getFirstName());
        System.out.println("Author's middle name: "+a.getMiddleName());
        System.out.println("Author's last name: "+a.getLastName());
        System.out.println("Author's phone number: "+a.getNumber());

	}

}
