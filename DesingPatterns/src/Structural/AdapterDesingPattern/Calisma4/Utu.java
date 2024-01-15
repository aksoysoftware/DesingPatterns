package Structural.Adapter;

public class Utu implements ElektrikliEvAletleri{

	private int volt;
	
	public Utu() {
		// TODO Auto-generated constructor stub
		this.volt = 220;
	}
	
	@Override
	public int prizeTakveCalistir() {
		System.out.println("Utu calisiyor");
	return volt;
	}

}
