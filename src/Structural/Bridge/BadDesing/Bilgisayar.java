package Structural.Bridge.BadDesing;

public class Bilgisayar {
	
	private Spotify spotify;
	private Hoporlor hoporlor;
	
	public Bilgisayar() {
		// TODO Auto-generated constructor stub
		spotify=new Spotify();
		hoporlor=new Hoporlor();
	}

	public void muzikCal(Muzik muzik) {
		String ses=spotify.muzikCal(muzik);
		hoporlor.sesiCal(ses);
	}
	
	
	public Spotify getSpotify() {
		return spotify;
	}

	public void setSpotify(Spotify spotify) {
		this.spotify = spotify;
	}

	public Hoporlor getHoporlor() {
		return hoporlor;
	}

	public void setHoporlor(Hoporlor hoporlor) {
		this.hoporlor = hoporlor;
	}
	

}
