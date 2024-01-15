package Structural.Bridge.GoodDesing;

public class Main {
		public static void main(String[] args) {
			
			ISesCalabilir sesCalabilir = new Hoporlor();
			MuzikCalabilir muzikCalabilir=new Spotify();
			
			Bilgisayar bilgisayar = new Bilgisayar(sesCalabilir, muzikCalabilir);
			
			
			 bilgisayar.getMuzikCalabilir();
		}
	
	
}
