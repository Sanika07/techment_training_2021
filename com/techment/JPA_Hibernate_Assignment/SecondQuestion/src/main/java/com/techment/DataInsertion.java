package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataInsertion {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "techment" );  
        EntityManager em = emf.createEntityManager( );  
        em.getTransaction().begin();
        
        Author author = new Author();
        author.setName("sanika");
        em.persist(author);
        
        Books bk1 = new Books();
        bk1.setISBN(1111);
        bk1.setTitle("hibernate");
        bk1.setPrice(700);
        em.persist(bk1);
        
        Books bk2 = new Books();
        bk2.setISBN(1112);
        bk2.setTitle("spring");
        bk2.setPrice(800);
        em.persist(bk2);
        
        System.out.println("======INSERTED======");
        em.getTransaction().commit();

	}

}
