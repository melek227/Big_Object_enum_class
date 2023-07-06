package com.melek.yilmaz.jpareal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

//index aramayı sıralamayı uniqueliği sağlar

@Entity
@Table(indexes= { 
		//indexi liste şeklinde tanımlamamızın sebebi birden fazla indexleme yöntemi olabilmesidir.
		//Ada göre, soyada göre, A-Z, Z-A 
   
   @Index(columnList="searchedName" ), //hangi sütunlardan index oluşturacağımızı belirledik.Hangi sütunda daha çok arama yapıldığını bilmeliyiz
   @Index(name="myIndex", columnList="searchedValue"),
   @Index(columnList="searchedCounts", unique=true),//unique de indexlerle yapıldığı için uniquelik koşulunu koyabilir
   @Index(columnList="searchedName, searchedValue")   //birden fazla field aynı anda indexlenebilir
   //önce counta göre sırala.countları aynıysa nameine göre sırala
   },
   //aramalarda ya da sıralamalarda kullanmak gerekmez sadece uniquelik sağlaması yeter
    uniqueConstraints=@UniqueConstraint(columnNames="singularName")
)//varlığa index koymak için
public class Search {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long searchedId;
	private String searchedName;
	private double searchedValue;
	private String singularName;
	public long getSearchedId() {
		return searchedId;
	}
	public void setSearchedId(long searchedId) {
		this.searchedId = searchedId;
	}
	public String getSearchedName() {
		return searchedName;
	}
	public void setSearchedName(String searchedName) {
		this.searchedName = searchedName;
	}
	public double getSearchedValue() {
		return searchedValue;
	}
	public void setSearchedValue(double searchedValue) {
		this.searchedValue = searchedValue;
	}
	public String getSingularName() {
		return singularName;
	}
	public void setSingularName(String singularName) {
		this.singularName = singularName;
	}
	

}
