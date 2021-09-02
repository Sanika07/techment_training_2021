package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyClientApp {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "techment" );  
        EntityManager em = emf.createEntityManager( );  
        em.getTransaction().begin();
        
        Author author = new Author();
        author.setName("nishita");
        em.persist(author);
        
        Books bk1 = new Books();
        bk1.setISBN(1111);
        bk1.setTitle("java");
        bk1.setPrice(900);
        em.persist(bk1);
        
        Books bk2 = new Books();
        bk2.setISBN(1112);
        bk2.setTitle("python");
        bk2.setPrice(1000);
        em.persist(bk2);
        
        System.out.println("====INSERTED====");
        em.getTransaction().commit();

	}

}
