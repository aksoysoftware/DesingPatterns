package Structural.Adapter;

public class Priz {
	
	
	
	public void elektirikVer(ElektrikliEvAletleri elektrikliEvAletleri) {	
		int volt = elektrikliEvAletleri.prizeTakveCalistir();
		System.out.println("Prizden " + volt + "volt aliniyor");
	}

}
