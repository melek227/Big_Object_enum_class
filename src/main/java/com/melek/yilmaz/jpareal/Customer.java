package com.melek.yilmaz.jpareal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Customer {

	@Id 
	@Table(name="cust") //veri tabanında tablo yok hatası verirse
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	//--------------------------MAPPİNG(EŞLEMLEME)--------------------------------------//
	@Column(name="cust_id")//veri tabanında böyle bir sütun yok hatası verirse
	private long _customerId;
	
	@Column(name="cust_name")//veri tabanında böyle bir sütun yok hatası verirse
	private String _customerName;
	
	@Column(name="tot_deb")//veri tabanında böyle bir sütun yok hatası verirse
	private  double _totalDebit;
	
	//Veri tabanındaki tabloyla classımız arasında eşlemleme yaptık
	//entity javada class, veritabanında tablo anlamında

	
	//-----------------------------------------------------------------------//
	
	public Customer() {
		
	}
	
	public Customer(long customerId, String customerName, double totalDebit) {
		_customerId=customerId;
		_customerName=customerName;
		_totalDebit=totalDebit;
	}
	
	
	public void setCustomerName(String customerName) {
		_customerName=customerName;
	}
	
	public String getcustomerName(){
		return _customerName;
		
	}
	
	public void setTotalDebit(double totalDebit){
		
		_totalDebit=totalDebit;
		
	}
	
	public double getTotalDebit() {
		return _totalDebit;
	}
	
	
	public void setCustomer(long customerId){
		_customerId=customerId;
		
	}
	
	public long getCustomer() {
		return _customerId;
	}
	
	
	
	
}
