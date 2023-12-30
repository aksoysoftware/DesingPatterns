package Creational.Builder;

public class Home {
	private String il;
	private String ilce;
	private String mahalle;
	
	private int binaYili;
	private int odaSayisi;
	private int banyoSayisi;
	private int tuvaletSayisi;
	private int banyoSyisi;
	
	
	private boolean isDublex;
	private boolean isEsyali;
	private boolean hasOtopark;
	private boolean hasKlima;
	private boolean hasCocukParki;
	private boolean hasHavuz;
	
	
	public Home(String il, String ilce, String mahalle, int binaYili, int odaSayisi, int banyoSayisi, int tuvaletSayisi,
			int banyoSyisi, boolean isDublex, boolean isEsyali, boolean hasOtopark, boolean hasKlima,
			boolean hasCocukParki, boolean hasHavuz) {
		super();
		this.il = il;
		this.ilce = ilce;
		this.mahalle = mahalle;
		this.binaYili = binaYili;
		this.odaSayisi = odaSayisi;
		this.banyoSayisi = banyoSayisi;
		this.tuvaletSayisi = tuvaletSayisi;
		this.banyoSyisi = banyoSyisi;
		this.isDublex = isDublex;
		this.isEsyali = isEsyali;
		this.hasOtopark = hasOtopark;
		this.hasKlima = hasKlima;
		this.hasCocukParki = hasCocukParki;
		this.hasHavuz = hasHavuz;
	}

	
	
	//zorunlu
	public Home(String il, String ilce, String mahalle, int binaYili, int odaSayisi, int banyoSayisi,
			int tuvaletSayisi) {
		super();
		this.il = il;
		this.ilce = ilce;
		this.mahalle = mahalle;
		this.binaYili = binaYili;
		this.odaSayisi = odaSayisi;
		this.banyoSayisi = banyoSayisi;
		this.tuvaletSayisi = tuvaletSayisi;
	}




	public Home() {
		super();
	}

	
	

	@Override
	public String toString() {
		return "Home [il=" + il + ", ilce=" + ilce + ", mahalle=" + mahalle + ", binaYili=" + binaYili + ", odaSayisi="
				+ odaSayisi + ", banyoSayisi=" + banyoSayisi + ", tuvaletSayisi=" + tuvaletSayisi + ", banyoSyisi="
				+ banyoSyisi + ", isDublex=" + isDublex + ", isEsyali=" + isEsyali + ", hasOtopark=" + hasOtopark
				+ ", hasKlima=" + hasKlima + ", hasCocukParki=" + hasCocukParki + ", hasHavuz=" + hasHavuz + "]";
	}


	public String getIl() {
		return il;
	}


	public void setIl(String il) {
		this.il = il;
	}


	public String getIlce() {
		return ilce;
	}


	public void setIlce(String ilce) {
		this.ilce = ilce;
	}


	public String getMahalle() {
		return mahalle;
	}


	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}


	public int getBinaYili() {
		return binaYili;
	}


	public void setBinaYili(int binaYili) {
		this.binaYili = binaYili;
	}


	public int getOdaSayisi() {
		return odaSayisi;
	}


	public void setOdaSayisi(int odaSayisi) {
		this.odaSayisi = odaSayisi;
	}


	public int getBanyoSayisi() {
		return banyoSayisi;
	}


	public void setBanyoSayisi(int banyoSayisi) {
		this.banyoSayisi = banyoSayisi;
	}


	public int getTuvaletSayisi() {
		return tuvaletSayisi;
	}


	public void setTuvaletSayisi(int tuvaletSayisi) {
		this.tuvaletSayisi = tuvaletSayisi;
	}


	public int getBanyoSyisi() {
		return banyoSyisi;
	}


	public void setBanyoSyisi(int banyoSyisi) {
		this.banyoSyisi = banyoSyisi;
	}


	public boolean isDublex() {
		return isDublex;
	}


	public void setDublex(boolean isDublex) {
		this.isDublex = isDublex;
	}


	public boolean isEsyali() {
		return isEsyali;
	}


	public void setEsyali(boolean isEsyali) {
		this.isEsyali = isEsyali;
	}


	public boolean isHasOtopark() {
		return hasOtopark;
	}


	public void setHasOtopark(boolean hasOtopark) {
		this.hasOtopark = hasOtopark;
	}


	public boolean isHasKlima() {
		return hasKlima;
	}


	public void setHasKlima(boolean hasKlima) {
		this.hasKlima = hasKlima;
	}


	public boolean isHasCocukParki() {
		return hasCocukParki;
	}


	public void setHasCocukParki(boolean hasCocukParki) {
		this.hasCocukParki = hasCocukParki;
	}


	public boolean isHasHavuz() {
		return hasHavuz;
	}


	public void setHasHavuz(boolean hasHavuz) {
		this.hasHavuz = hasHavuz;
	}
	
	
	

}
