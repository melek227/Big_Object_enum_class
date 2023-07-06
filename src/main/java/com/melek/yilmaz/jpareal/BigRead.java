package com.melek.yilmaz.jpareal;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BigRead {
	
	public static void main(String [] args) throws IOException{
		
		
		long bigId=2;
		
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("OurPersistenceUnit");
		EntityManager entityManager=factory.createEntityManager();	
		
		try {
			
			Big big=entityManager.find(Big.class, bigId);
			
			entityManager.getTransaction().begin();
			
			entityManager.persist(big);
			
			
			entityManager.getTransaction().commit();
			
			entityManager.close();
			
			
			String bigText=big.getBigText();
			byte [] bigBytes=big.getBigByte();
			
			Files.write(
					//Bigtext'ten elde edilen baytları UTF-8 kodlu metin olarak dosyaya yazmak için Files.write yöntemi
					Paths.get("ourstyle.css"), // dosya yolunu temsil eden bir Paths nesnesi elde etmek için kullanılır
					bigText.getBytes( Charset.forName("utf-8") //Bigtext'ten elde edilen baytları UTF-8 formatına çevirir
							
					));
			
			
			Files.write(Paths.get("ourimage.jpg"), bigBytes);
			
			
			
		}catch(IOException ex) {
			
			
			ex.printStackTrace();
			
			
		}
		
		
	
		
	
	}

}
