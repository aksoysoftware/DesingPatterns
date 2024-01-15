package VisitorDesingPattern.Calisma3;

public class VadeliHesap  implements Hesap {

	private double bakiye;
	private double faizOrani;
	
	
	public VadeliHesap(double bakiye, double faizOrani) {
		super();
		this.bakiye = bakiye;
		this.faizOrani = faizOrani;
	}
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	public double getFaizOrani() {
		return faizOrani;
	}
	public void setFaizOrani(double faizOrani) {
		this.faizOrani = faizOrani;
	}
	@Override
	public void accept(Visitor visitor) {
			visitor.visitVadeli(this);
	}
	
	
	
}
