package Creational.Factory;

public class TelefonFactory {
	
	public static Telefon getTelefon(String model, String batarya, int en, int boy) {
		
		Telefon telefon ;
		if ("s8".equalsIgnoreCase(model)) {
		telefon	= new S8(model, batarya, en, boy);
		
		
		}else if ("note8".equalsIgnoreCase(model)) {
			telefon = new Note8(model, batarya, en, boy);
		}
		else {
			throw new RuntimeException("Gecerli bir model degil");
		}
		return telefon;
		
	}

}
