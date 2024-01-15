package BridgeDesingPattern;

public class MainMatbaa {
	
	
	public static void main(String[] args) {
		Renk kirmiziRenk = new KirimiziRenk();
		Boyut a4Boyut = new A4Boyut();
		
		Kapak kitap = new KitapKapak("Kirmizi", "A4", kirmiziRenk, a4Boyut);
	
		System.out.println(kitap.kapakOlustur());
		
	}

}
