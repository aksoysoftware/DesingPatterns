package VisitorDesingPattern.Calisma3;

public class Banka {

	public static void main(String[] args) {
		Hesap vadesizHesap = new VadesizHesap(1000);
		//Hesap vadeliHesap = new VadeliHesap(1000, 0.2);
		//Hesap krediKartHesap = new KrediKartı(1000,20000, 0.5);
		
		
		Visitor faizVisitor = new FaizVisitor();
		

		vadesizHesap.accept(faizVisitor); // Vadesiz hesabın faizi yok.
	       
		
		
		
		
	}
	
}
