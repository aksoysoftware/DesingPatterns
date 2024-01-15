package Structural.Adapter;

public class SamsungTelefon implements Telefon{

	private int calismaVolt;
	
	public SamsungTelefon() {
		// TODO Auto-generated constructor stub
		calismaVolt=5;
	}
	
	@Override
	public int sarjEt() {
			System.out.println("SamsungTelefon sarj oluyor");
			return calismaVolt;
	}

}
