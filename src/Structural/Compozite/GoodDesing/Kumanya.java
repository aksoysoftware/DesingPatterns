package Structural.Compozite.GoodDesing;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Kumanya implements Fiyatlanabilir {

    private FiyatHesaplaUtil fiyatHesaplaUtil = new FiyatHesaplaUtil();
    private String ad;
    private List<Urun> urunList;
    private List<Paket> paketList;

    
    
    
    
    public FiyatHesaplaUtil getFiyatHesaplaUtil() {
		return fiyatHesaplaUtil;
	}

	public void setFiyatHesaplaUtil(FiyatHesaplaUtil fiyatHesaplaUtil) {
		this.fiyatHesaplaUtil = fiyatHesaplaUtil;
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

	public Kumanya(String ad) {
        this.ad = ad;
        this.urunList = new ArrayList<>();
        this.paketList = new ArrayList<>();
    }

    @Override
    public BigDecimal getFiyat() {
        BigDecimal toplamUrunFiyat = fiyatHesaplaUtil.getToplamUrunFiyat(urunList);
        BigDecimal toplamPaketFiyat = fiyatHesaplaUtil.getToplamPaketFiyat(paketList);

        return toplamUrunFiyat.add(toplamPaketFiyat);
    }
}
