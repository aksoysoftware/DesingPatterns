package Structural.Compozite.PoorDesing;

import java.util.ArrayList;
import java.util.List;

public class Paket {
	
	private String ad;
	private List<Urun> urunList;
	
	
	public Paket(String ad) {
		super();
		this.ad = ad;
		this.urunList = new ArrayList<Urun>();
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public List<Urun> getUrunList() {
		return urunList;
	}
	public void setUrunList(List<Urun> urunList) {
		this.urunList = urunList;
	}
	
	

}
