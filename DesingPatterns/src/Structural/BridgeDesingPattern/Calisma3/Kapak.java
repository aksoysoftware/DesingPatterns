package BridgeDesingPattern;

public abstract class Kapak {
	
	private String renk;
	private String boyut;
	
	
	public Kapak(String renk, String boyut) {
		super();
		this.renk = renk;
		this.boyut = boyut;
	}


	public String getRenk() {
		return renk;
	}


	public void setRenk(String renk) {
		this.renk = renk;
	}


	public String getBoyut() {
		return boyut;
	}


	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}
	
	public abstract String kapakOlustur();
	

}


