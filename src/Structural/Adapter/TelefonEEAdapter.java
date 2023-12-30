package Structural.Adapter;

public class TelefonEEAdapter implements ElektrikliEvAletleri {

	private Telefon telefon;
	
	public TelefonEEAdapter(Telefon telefon) {
		this.telefon=telefon;
	}
	
	@Override
	public int prizeTakveCalistir() {
		return telefon.sarjEt();
		
	}

}
