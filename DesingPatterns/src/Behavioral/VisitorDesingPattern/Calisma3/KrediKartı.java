package VisitorDesingPattern.Calisma3;

public class KrediKartı implements Hesap {
	
	private double borc;
	private double faizOrani;
	private double limit;
	 public KrediKartı(double borc, double limit, double faizOrani) {
	        this.borc = borc;
	        this.limit = limit;
	        this.faizOrani = faizOrani;
	    }
	public double getBorc() {
		return borc;
	}
	public void setBorc(double borc) {
		this.borc = borc;
	}
	public double getFaizOrani() {
		return faizOrani;
	}
	public void setFaizOrani(double faizOrani) {
		this.faizOrani = faizOrani;
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	@Override
	public void accept(Visitor visitor) {

		visitor.visitKrediKarti(this);
	}

	
	
	
	
	
	
}
