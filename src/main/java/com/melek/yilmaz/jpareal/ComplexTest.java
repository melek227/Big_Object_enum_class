package com.melek.yilmaz.jpareal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TemporalType;





public class ComplexTest {
	
	public static void main(String [] args) {
		
		Complex complex=new Complex();
		complex.setComplexName("Karmaşık ad");
		complex.setComplexValue(123.45);
		
		
		//enum değerleri veri tabanına düz sayı olarak saklanır
		//SMALL-1 MEDIUM-2 LARGE-3 şeklinde
		@Enumerated(value=EnumType.STRING)
		//MEDİUM LARGE SMALL şeklinde saklamak için tipini belirttik
		
		
		complex.setComplexKind(ComplexKind.LARGE); //enum değeri
		
		@Temporal(TemporalType.DATE)//ya tarih ya zaman kullanılır
		complex.setComplexDate(new Date(System.currentTimeMillis())) //şuanki zamanı verdik
		complex.setTemporaryField("Geçici değer");
		
		
		
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("OurPersistenceUnit");
		EntityManager entityManager=factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		
		entityManager.persist(complex);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		
		
		
		
	}

}
