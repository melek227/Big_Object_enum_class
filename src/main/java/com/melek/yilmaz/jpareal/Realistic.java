package com.melek.yilmaz.jpareal;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Realistic {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long _realisticId;
	@Column(length=80,    //veritabanına kaydedeceğimiz stringin boyunu belirledik
			nullable=false,  //null değer alamaz
			updatable=false, //veri tabanına bir kez kaydedildikten sonra bi daha değiştirilemesin
			) 
	private String _realisticName;
	@Column(precision=12,  //value kaç rakamlı olabilir //herhangi bir değer verdik
			scale=2 //ondalık kısımda kaç rakam olsun //lira-kuruş 
			)
	private double _realisticValue;
	
	
	public Realistic() {
		
		
	}
	
	public Realistic(long realisticId, String realisticName, double realisticValue) {
		_realisticId=realisticId;
		_realisticName=realisticName;
		_realisticValue=realisticValue;
		
	}
	
	public long getRealisticId() {
		return _realisticId;
		
	}
	
	public void setRealisticId(long realisticId) {
		_realisticId=realisticId;
	}
	
	public String getRealisticName() {
		return _realisticName;
	}
	
	public void setRealisticName(String realisticName) {
		_realisticName=realisticName;
	}
	
	
	public double getRealisticValue() {
		return _realisticValue;
	}
	
	public void setRealisticValue(double realisticValue) {
		_realisticValue=realisticValue;
	}

	
	
	//-------------------------------------------------------------------------//
	//iki ayrı nesne aynı kaydı bulsun.Databasedeki aynı olduğu için bu kayıtların eşit olmasını bekleriz
	//java için aynı nesne değiller.Bu sebeple eşit olmazlar
	//eşitlik yöntemi ezilmeli.Eşitlik tanımlanmalı

	@Override
	public int hashCode() {
		return Objects.hash(_realisticId, _realisticName, _realisticValue);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Realistic other = (Realistic) obj;
		return _realisticId == other._realisticId && Objects.equals(_realisticName, other._realisticName)
				&& Double.doubleToLongBits(_realisticValue) == Double.doubleToLongBits(other._realisticValue);
	}
	
	

}
