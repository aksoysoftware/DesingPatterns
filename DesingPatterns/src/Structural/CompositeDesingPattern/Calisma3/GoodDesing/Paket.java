package Structural.Compozite.GoodDesing;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Paket implements Fiyatlanabilir {

    private String ad;
    private List<Urun> urunList;
    private FiyatHesaplaUtil fiyatHesaplaUtil = new FiyatHesaplaUtil();

    public Paket(String ad) {
        this.ad = ad;
        this.urunList = new ArrayList<>();
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

    @Override
    public BigDecimal getFiyat() {
        return fiyatHesaplaUtil.getToplamUrunFiyat(urunList);
    }
}
