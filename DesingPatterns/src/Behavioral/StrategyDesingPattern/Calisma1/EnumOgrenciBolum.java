package StrategyDesingPattern.Calisma1;

public enum EnumOgrenciBolum {
	
	SOZEL("Sözel"),
	SAYISAL("Sayisal"),
	ESITAGIRLIK("Esit Agirlik"),
	
	;

	private String bolum;
	
	EnumOgrenciBolum(String bolum) {
		 this.bolum=bolum;
	
	}
	 
	 @Override
	public String toString() {	
		return bolum;
	}

}
