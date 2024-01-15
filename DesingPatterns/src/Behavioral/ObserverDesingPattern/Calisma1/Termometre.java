package ObserverDesingPattern.Calisma1;

import java.math.BigDecimal;

public class Termometre extends Observable{

	 private BigDecimal anlikSicaklik;
	 private BigDecimal minSicaklik;
	 private BigDecimal maxxSicaklik;
	 
	 
	public Termometre( BigDecimal minSicaklik, BigDecimal maxxSicaklik) {
		super();
		this.anlikSicaklik = BigDecimal.valueOf(24);
		this.minSicaklik = minSicaklik;
		this.maxxSicaklik = maxxSicaklik;
	}


	public BigDecimal getAnlikSicaklik() {
		return anlikSicaklik;
	}


	public void setAnlikSicaklik(BigDecimal anlikSicaklik) {
		this.anlikSicaklik = anlikSicaklik;
		
		System.out.println(anlikSicaklik);
		
		sicakligiKontrolEt(anlikSicaklik);
	}
	
	private void sicakligiKontrolEt(BigDecimal anlikSicaklik) {
	   
	boolean isCokSicak=anlikSicaklik.compareTo(maxxSicaklik)>=0;
	boolean isCokSoguk=anlikSicaklik.compareTo(minSicaklik)<=0;
		
	if (isCokSoguk || isCokSicak) {
		haberVer();
	 }	
		
		
	}
	 
	 
	 

	
	 
	 
	 
}
