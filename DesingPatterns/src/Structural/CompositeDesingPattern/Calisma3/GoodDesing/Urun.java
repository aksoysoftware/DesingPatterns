package Structural.Compozite.GoodDesing;

import java.math.BigDecimal;

public class Urun implements Fiyatlanabilir{
	
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
	
	@Override
	public BigDecimal getFiyat() {
		return fiyat;
	}
	public void setFiyat(BigDecimal fiyat) {
		this.fiyat = fiyat;
	}
	
	
	
	

}
