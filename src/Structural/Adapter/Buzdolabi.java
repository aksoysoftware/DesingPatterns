package Structural.Adapter;

public class Buzdolabi implements ElektrikliEvAletleri{
    
	private int volt;
	
	public Buzdolabi() {
		// TODO Auto-generated constructor stub
		this.volt = 220;
	}
	
	@Override
	public int prizeTakveCalistir() {
		System.out.println("Buzdolaibi calisiyor");
	return volt;
	}
	
}
