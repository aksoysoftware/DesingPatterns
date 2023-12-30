package Structural.Bridge.BadDesing;


/*
 * Uygulamada esnek bir mimariye dönüşmesini sağlar
 * Büyük projelerde karmaşıklığı azaltır
 * Soyutlama ve implementeasyonla uygulamaları ayırır
 * Dikeyde büyükmek yerine yatayda büyütmeyi amaçlar
 * */

public class Main {
	
		public static void main(String[] args) {
			
			Muzik muzik = new Muzik("Sezen Aksu - Gulumse", "Gulumse hadi gel");
			
			Bilgisayar bilgisayar = new Bilgisayar();
			bilgisayar.muzikCal(muzik);
			
			
		}
}
