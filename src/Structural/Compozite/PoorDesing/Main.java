package Structural.Compozite.PoorDesing;

import java.math.BigDecimal;

/*
 * 
 * 
 * 
 * */


public class Main {
		public static void main(String[] args) {
			
			/*
			 * Worst Case
			 * Open-Closed against
			 */
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
			
			Sepet sepet = new Sepet("Benim Sepetim");
			
			sepet.getPaketList().add(teknolojiPaket);
			sepet.getPaketList().add(sebzePaket);
			sepet.getUrunList().add(futbolTopUrun);
			
			BigDecimal toplamTutarBigDecimal = sepet.getToplamTutar();
			System.out.println("Odenecek Tutar = "+ toplamTutarBigDecimal +" TL");
			
			
			
			
			

		}
}
