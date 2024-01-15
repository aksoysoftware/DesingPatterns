package Structural.Compozite.PoorDesing;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sepet {

	private String ad;
	private List<Urun>urunList;
	private List<Paket> paketList;
	
	
	public Sepet(String ad) {
		super();
		this.ad = ad;
		this.urunList = new ArrayList<>();
		this.paketList = new ArrayList<>();
	}

	public BigDecimal getToplamTutar() {
       
		BigDecimal toplamTutar = BigDecimal.ZERO;

        for (Urun urun : urunList) {
            toplamTutar = toplamTutar.add(urun.getFiyat());
        }

        for (Paket paket : paketList) {
            List<Urun> paketUrunList = paket.getUrunList();

            for (Urun urun : paketUrunList) {
                toplamTutar = toplamTutar.add(urun.getFiyat());
            }
        }

        return toplamTutar;
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


	public List<Paket> getPaketList() {
		return paketList;
	}


	public void setPaketList(List<Paket> paketList) {
		this.paketList = paketList;
	}

	
	
	
	
}
