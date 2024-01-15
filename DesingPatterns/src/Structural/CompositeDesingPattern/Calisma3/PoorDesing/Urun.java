package Structural.Compozite.PoorDesing;

import java.math.BigDecimal;

public class Urun {
	
	private String name;
	private BigDecimal fiyat;
	
	
	public Urun(String name, BigDecimal fiyat) {
		super();
		this.name = name;
		this.fiyat = fiyat;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getFiyat() {
		return fiyat;
	}
	public void setFiyat(BigDecimal fiyat) {
		this.fiyat = fiyat;
	}
	
	
	
	

}
