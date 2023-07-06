package com.melek.yilmaz.jpareal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

//çok büyük türde verilere karakter large obje (iri nesne) denir
//varchar gibi sınırlı veri türlerinde saklanamayan verilerdir
//nesne resim video gibiyse binary blob(binary large object) olur


@Entity
public class Big {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	private long bigId;
	
	@Lob //büyük bir nesne olduğunu field şeklinde saklamaması gerektiğini belirtir
	private String bigText;
	
	@Lob
	private byte[] bigByte; //binary olacağı için byte verdik
	
	
	public long getBigId() {
		return bigId;
	}
	public void setBigId(long bigId) {
		this.bigId = bigId;
	}
	public String getBigText() {
		return bigText;
	}
	public void setBigText(String bigText) {
		this.bigText = bigText;
	}
	public byte[] getBigByte() {
		return bigByte;
	}
	public void setBigByte(byte[] bigByte) {
		this.bigByte = bigByte;
	}
	
	
	
}
