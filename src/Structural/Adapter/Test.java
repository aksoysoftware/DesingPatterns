package Structural.Adapter;

public class Test {
	
	public static void main(String[] args) {
		
		Priz priz = new Priz();
		
		Utu utu = new Utu();
		
		Buzdolabi buzdolabi = new Buzdolabi();
		
		priz.elektirikVer(buzdolabi);
		priz.elektirikVer(utu);
		
		SamsungTelefon samsungTelefon  = new SamsungTelefon();
		
		TelefonEEAdapter adapter = new TelefonEEAdapter(samsungTelefon);
		
		priz.elektirikVer(adapter);
		
	}

}
