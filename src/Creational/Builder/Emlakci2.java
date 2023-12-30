package Creational.Builder;

public class Emlakci2 {
	public static void main(String[] args) {
	Home home =	EvBuilder.startNormalHomeBuilder("Istanbul", 
			"Besiktas", "Abbasağa", 2020, 3, 2, 1)
		.build();
		
	Home home2 =	EvBuilder.startHavuzluHomeBuilder("Istanbul", 
			"Kadikoy", "Moda", 1997, 2, 2, 1)
		.build();
	
	printEv(home);
	printEv(home2);
		
	}

private static void printEv(Home home) {
		
		System.out.println();
		
		System.out.println("Ev eklendi ->" + home);
		
		System.out.println();
		
	}
}
