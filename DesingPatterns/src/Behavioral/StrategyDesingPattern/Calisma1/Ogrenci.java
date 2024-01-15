package StrategyDesingPattern.Calisma1;

public class Ogrenci {
	
	private EnumOgrenciBolum bolum;
	private SinavStratejisi sinavStratejisi;
	
	
	public Ogrenci(EnumOgrenciBolum bolum) {
		super();
		this.bolum = bolum;
		
		if (bolum == null) {
			throw new NullPointerException("Bolum bos olamaz");
			
		}
		switch (bolum) {
		case SOZEL:
			sinavStratejisi = new SozelStratejisi();
			break;
		
		case ESITAGIRLIK:
			sinavStratejisi= new EsitAgirlikStratejisi();
			break;
		case SAYISAL:
			sinavStratejisi=new  SayisalStratejisi();
			break;
		default:
			break;
		}
		
		
		
	}
	public String oncelikSiralamasi() {
		System.out.println(bolum + "ıcın strateji");
	
		String siralama =" 1."+ sinavStratejisi.getBirinci()+
				" 2. "+sinavStratejisi.getIkıncı()+
				" 3. "+sinavStratejisi.getUcuncu()+
				" 4. "+sinavStratejisi.getDorduncu();
		
		return siralama;
	}
	
	
	

}
