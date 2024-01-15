package Structural.Bridge.GoodDesing;

public class Bilgisayar {
	
	ISesCalabilir sesCalabilir;
	MuzikCalabilir muzikCalabilir;
	
	
	public Bilgisayar(ISesCalabilir sesCalabilir, MuzikCalabilir muzikCalabilir) {
		super();
		this.sesCalabilir = sesCalabilir;
		this.muzikCalabilir = muzikCalabilir;
	}
	public ISesCalabilir getSesCalabilir() {
		return sesCalabilir;
	}
	public void setSesCalabilir(ISesCalabilir sesCalabilir) {
		this.sesCalabilir = sesCalabilir;
	}
	public MuzikCalabilir getMuzikCalabilir() {
		return muzikCalabilir;
	}
	public void setMuzikCalabilir(MuzikCalabilir muzikCalabilir) {
		this.muzikCalabilir = muzikCalabilir;
	}
	
	
	

}
