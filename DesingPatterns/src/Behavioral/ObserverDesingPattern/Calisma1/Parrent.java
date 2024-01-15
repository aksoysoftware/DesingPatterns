package ObserverDesingPattern.Calisma1;

public class Parrent implements Observer{

	private String adi;
	
	
	
	public Parrent(String adi) {
		setAdi(adi);
	}



	public String getAdi() {
		return adi;
	}



	public void setAdi(String adi) {
		this.adi = adi;
	}



	@Override
	public void update(Observable observable) {
		
		Termometre termometre = (Termometre) observable;
		
		System.out.println(getAdi()+" Uyarı!!  "+termometre.getAnlikSicaklik());
		
		
	}

}
