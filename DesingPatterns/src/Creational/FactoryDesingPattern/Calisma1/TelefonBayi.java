package Creational.Factory;

public class TelefonBayi {
	public static void main(String[] args) {
		Telefon s8=TelefonFactory.getTelefon("s8", "260mH", 4, 7);
		
		Telefon note8=TelefonFactory.getTelefon("note8", "300mH", 5, 8);
	
		System.out.println(s8);
		System.out.println(note8);
	}

}
