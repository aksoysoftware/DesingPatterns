package Structural.Compozite.GoodDesing;

import java.math.BigDecimal;



public class Main {
	
	public static void main(String[] args) {
		
		Urun domates = new Urun("Domates", BigDecimal.TEN);
		Urun patates = new Urun("Patates", BigDecimal.ONE);
		Urun sogan = new Urun("Sogan", BigDecimal.ONE);
		
		Paket sebzePaket = new Paket("Sebze Paketi");
		sebzePaket.getUrunList().add(patates);
		sebzePaket.getUrunList().add(domates);
		sebzePaket.getUrunList().add(sogan);
		
		Urun sesSistemi = new Urun("Ses sistemi", BigDecimal.valueOf(5000));
		Urun kulaklik = new Urun("Kulaklik", BigDecimal.valueOf(1000));
		
		Paket teknolojiPaket = new Paket("Teknoloji Paketi");
		
		teknolojiPaket.getUrunList().add(sesSistemi);
		teknolojiPaket.getUrunList().add(kulaklik);
		
		Urun futbolTopUrun = new Urun("Futbol Topu", BigDecimal.valueOf(100));
		
		
		
		
	
		Kumanya kumanya = new Kumanya(	"Ramazan Sepeti");
		Urun yagUrun = new Urun("Yag",BigDecimal.valueOf(50));
		
		kumanya.getPaketList().add(sebzePaket);
		kumanya.getUrunList().add(yagUrun);
		
		
		Sepet sepet = new Sepet("Benim Sepetim");
		
		
		
		sepet.getFiyatlanabilirList().add(teknolojiPaket);
		sepet.getFiyatlanabilirList().add(sebzePaket);
		sepet.getFiyatlanabilirList().add(futbolTopUrun);
		
		sepet.getFiyatlanabilirList().add(kumanya);
		
		
		
		BigDecimal toplamTutarBigDecimal = sepet.toplamOdenecekTutar();
		System.out.println("Odenecek Tutar = "+ toplamTutarBigDecimal +" TL");
		
		
		
	}

}
