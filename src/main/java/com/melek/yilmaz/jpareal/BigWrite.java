package com.melek.yilmaz.jpareal;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BigWrite {
	
	public static void main(String[] args) throws IOException{
		
		
		try {
			
			String bigText=new String (Files.readAllBytes(Paths.get("mystyle.css")), Charset.forName("utf-8"));
			
			byte[] bigBytes= Files.readAllBytes(
					//Bu yöntem, bir dosyadan tüm baytları okumak için Dosyalar sınıfında çağrılır. 
					
					Paths.get("myimage.jpg")); //Dosya yolunu parametre olarak temsil eden bir Path nesnesi alır
			
			
			Big big=new Big();
			big.setBigText(bigText);
			big.setBigByte(bigBytes);
			
			
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("OutPersistenceUnit");
			EntityManager entityManager=factory.createEntityManager();
			
			
			entityManager.getTransaction().begin();
			
			entityManager.persist(big);
			
			
			entityManager.getTransaction().commit();
			
			
			entityManager.close();
			
			
		}catch(IOException ex) {
			ex.printStackTrace();
			
		}
		
		
		
		
		
	}

}
