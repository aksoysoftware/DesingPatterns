package ObserverDesingPattern.Calisma1;

import java.math.BigDecimal;

public class Main {
	
	public static void main(String[] args) {
		
		BigDecimal minSicaklik=BigDecimal.valueOf(23);
		BigDecimal maxSicaklik=BigDecimal.valueOf(28);
		
		Termometre termometre=new Termometre( minSicaklik, maxSicaklik);
		
		Parrent anne = new Parrent("Anne");
		Parrent baba = new Parrent("Baba");
		
		termometre.ekle(baba);
		termometre.ekle(anne);
	
		
		for(int i = termometre.getAnlikSicaklik().intValue(); i<30 ; i++) {
			
			termometre.setAnlikSicaklik(BigDecimal.valueOf(i)); 
		}
	for(int i = termometre.getAnlikSicaklik().intValue(); i>22 ; i--) {
		termometre.setAnlikSicaklik(BigDecimal.valueOf(i));
		}
	}

}
