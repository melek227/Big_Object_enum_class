package com.melek.yilmaz.jpareal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class SearchText {

	
	public static void main(String[] args) {

        EntityManagerFactory factory=Persistence.createEntityManagerFactory("OurPersistenceUnit");//jpa ya bağlanmak için
        EntityManager entityManager=factory.createEntityManager();//veritabanına bağlanan classın adı
        
        Customer customer=new Customer();
        
        
        
       
        

        
        for(int i=1; i<100; i++) { //birden çok kayıt eklemek için
        	
        	 entityManager.getTransaction().begin();
        	
        	Search search=new Search();
        	search.setSearchedName("Ad: " + i);
        	search.setSearchedCount(i);
        	search.setSearchedValue(12345.0 + i * 100); //rastgele değerler üretmek için eklediğimiz sayı
        	search.setSingularName("Biricik: " + i); //uniqueliği sağlamak için
        	
        	entityManager.persist(search);
        	

            entityManager.getTransaction().commit();
        	
        }




        entityManager.close();

    }
	
}
