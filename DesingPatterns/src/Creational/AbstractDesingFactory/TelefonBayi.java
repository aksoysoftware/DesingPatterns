package Creational.AbstractFactory;

public class TelefonBayi {
	
	public static void main(String[] args) {

		//S8Factory s8Factory= new S8Factory();
		Telefon s8 = new S8("s8", "400", 7, 7);
		
		
		
		//Note8Factory note8Factory = new Note8Factory();
		Telefon note8 = new Note8("note8", "800", 5, 9);
		
		System.out.println();
		System.out.println(s8);
		System.out.println();
		System.out.println(note8);
	}

}
