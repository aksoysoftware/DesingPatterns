package Creational.Factory;

public class S8 implements Telefon {

	private String model;
	private String batarya;
	private int en;
	private int boy;
	
	
	public S8(String model, String batarya, int en, int boy) {
		super();
		this.model = model;
		this.batarya = batarya;
		this.en = en;
		this.boy = boy;
	}

	@Override
	public String model() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public String getBatarya() {
		// TODO Auto-generated method stub
		return batarya;
	}

	@Override
	public int getEn() {
		// TODO Auto-generated method stub
		return en;
	}

	@Override
	public int getBoy() {
		// TODO Auto-generated method stub
		return boy;
	}

	@Override
	public String toString() {
		return "S8 [model=" + model + 
				", batarya=" + batarya + 
				", en=" + en +
				", boy=" + boy + "]";
	}

	
}
