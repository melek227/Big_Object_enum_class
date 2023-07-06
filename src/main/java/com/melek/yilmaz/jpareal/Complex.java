package com.melek.yilmaz.jpareal;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//enumu kullanan class


@Entity
public class Complex {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long complexId;
	private String complexName;
	private double complexValue;
	private ComplexKind complexKind; //enum türünde attribute 
	private Date complexDate; //hem zaman hem tarih tutuyor.Ay yıl gün ; saat dakika milisaniye
	
	@Transient //veritabanında field açılmamasını istersek kullanırız
	private String temporaryField; //
	
	
	
	public Complex(long complexId, String complexName, double complexValue, ComplexKind complexKind) {
		super();
		this.complexId = complexId;
		this.complexName = complexName;
		this.complexValue = complexValue;
		this.complexKind = complexKind;
	}
	
	
	public long getComplexId() {
		return complexId;
	}
	public void setComplexId(long complexId) {
		this.complexId = complexId;
	}
	public String getComplexName() {
		return complexName;
	}
	public void setComplexName(String complexName) {
		this.complexName = complexName;
	}
	public double getComplexValue() {
		return complexValue;
	}
	public void setComplexValue(double complexValue) {
		this.complexValue = complexValue;
	}
	public ComplexKind getComplexKind() {
		return complexKind;
	}
	public void setComplexKind(ComplexKind complexKind) {
		this.complexKind = complexKind;
	}


	public void setTemporaryField(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
