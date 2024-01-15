package Creational.Builder;

public class Emlakci {

	public static void main(String[] args) {
		
		Home home = new Home();
		home.setIl("İstanbul");
		home.setIlce("Atasehir");
		home.setMahalle("Ataturk");
		home.setOdaSayisi(3);
		home.setHasKlima(true);
		
		
		Home home2 = new Home("Istanbul", "Besiktas", 
				"Abbasağa", 2020, 3, 2, 1, 2,
				true, true, true, false, true, true);
		
		printEv(home);
		printEv(home2);
	}

	
	
	
	
	
	private static void printEv(Home home) {
		
		System.out.println();
		
		System.out.println("Ev eklendi ->" + home);
		
		System.out.println();
		
	}
}
