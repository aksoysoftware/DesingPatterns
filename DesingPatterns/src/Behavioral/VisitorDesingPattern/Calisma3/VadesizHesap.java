package VisitorDesingPattern.Calisma3;

public class VadesizHesap implements Hesap {
	
	private double bakiye;

	public VadesizHesap(double bakiye) {
		super();
		this.bakiye = bakiye;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitVadesiz(this);
		
	}
	
	
	

}
