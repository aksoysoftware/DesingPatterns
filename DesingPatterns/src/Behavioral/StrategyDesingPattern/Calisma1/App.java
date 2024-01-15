package StrategyDesingPattern.Calisma1;

public class App {
	
	public static void main(String[] args) {
		Ogrenci ogrenci=new Ogrenci(EnumOgrenciBolum.SAYISAL);
		
		Ogrenci ogrenci2 = new Ogrenci(EnumOgrenciBolum.ESITAGIRLIK);
		
		System.out.println(ogrenci.oncelikSiralamasi());
		
		System.out.println(ogrenci2.oncelikSiralamasi());
	}

}
