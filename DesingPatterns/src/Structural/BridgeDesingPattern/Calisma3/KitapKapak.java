package BridgeDesingPattern;

public class KitapKapak extends Kapak{

	Renk renklendir;
	Boyut boyutlandir;
	
	public KitapKapak(String renk, String boyut,Renk renklendir , Boyut boyutlandir ) {
		super(renk, boyut);
		// TODO Auto-generated constructor stub
		this.renklendir=renklendir;
		this.boyutlandir=boyutlandir;
	}

	@Override
	public String kapakOlustur() {
		// TODO Auto-generated method stub
		return renklendir.renkUygula()+"renkli"+boyutlandir.boyutUygula()+"boyutlu kitap";
	}

}
