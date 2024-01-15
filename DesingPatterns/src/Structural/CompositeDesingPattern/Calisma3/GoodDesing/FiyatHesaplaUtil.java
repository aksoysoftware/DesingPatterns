package Structural.Compozite.GoodDesing;

import java.math.BigDecimal;
import java.util.List;

public class FiyatHesaplaUtil {

    public BigDecimal getToplamUrunFiyat(List<Urun> urunList) {
        BigDecimal toplamTutarBigDecimal = BigDecimal.ZERO;

        for (Urun urun : urunList) {
            toplamTutarBigDecimal = toplamTutarBigDecimal.add(urun.getFiyat());
        }

        return toplamTutarBigDecimal;
    }

    public BigDecimal getToplamPaketFiyat(List<Paket> paketList) {
        BigDecimal toplamTutarBigDecimal = BigDecimal.ZERO;

        for (Paket paket : paketList) {
            toplamTutarBigDecimal = toplamTutarBigDecimal.add(paket.getFiyat());
        }

        return toplamTutarBigDecimal;
    }
}
