package Structural.Compozite.GoodDesing;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sepet {

	private String ad;
	private List<Fiyatlanabilir>fiyatlanabilirList;
	
	
	public Sepet(String ad) {
		super();
		this.ad = ad;
		this.fiyatlanabilirList = new ArrayList<>();
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public List<Fiyatlanabilir> getFiyatlanabilirList() {
		return fiyatlanabilirList;
	}


	public void setFiyatlanabilirList(List<Fiyatlanabilir> fiyatlanabilirList) {
		this.fiyatlanabilirList = fiyatlanabilirList;
	}
	
	public BigDecimal toplamOdenecekTutar() {
		BigDecimal toplamTutarBigDecimal = BigDecimal.ZERO;
		for (Fiyatlanabilir fiyatlanabilir : fiyatlanabilirList) {
			toplamTutarBigDecimal=toplamTutarBigDecimal.add(fiyatlanabilir.getFiyat());
			
		}
		return toplamTutarBigDecimal;
	}
	
}
