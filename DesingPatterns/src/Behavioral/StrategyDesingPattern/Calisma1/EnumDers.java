package StrategyDesingPattern.Calisma1;

public enum EnumDers {
	
	TURKCE("Türkçe"),
	MATEMATIK("Matematik"),
	FEN("Fen"),
	SOSYAL("Sosyal")
	;

	private String ders;
	
	 EnumDers(String ders) {
		 this.ders=ders;
	
	}
	 
	 @Override
	public String toString() {	
		return ders;
	}
	
}
