package com.melek.yilmaz.jpareal;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplier {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	private long supplierId;
	private String supplierName;
	private double totalCredit;
	
	
	public Supplier() {
		
	}
	
	
	public Supplier(long supplierId, String supplierName, double totalCredit) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.totalCredit = totalCredit;
	}
	
	
	
	public long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public double getTotalCredit() {
		return totalCredit;
	}
	public void setTotalCredit(double totalCredit) {
		this.totalCredit = totalCredit;
	}
	
	

}
