package FactoryDesingPattern;

public class Program {
				
	public static void main(String[] args) {
		TCDarphane tcDarphane = new TCDarphane();
		Lira tl = (Lira) tcDarphane.paraBas(200);
		System.out.println(tl.getM_NominalDeger());
		
		}
			
	
}
