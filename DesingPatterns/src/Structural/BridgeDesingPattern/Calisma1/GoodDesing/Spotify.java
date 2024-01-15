package Structural.Bridge.GoodDesing;

import Structural.Bridge.BadDesing.Muzik;

public class Spotify implements MuzikCalabilir{

	@Override
	public String muzikCal(Muzik muzik) {
		
		System.out.println("Spotifyda" +muzik+ "caliyor");
		return muzik.getSes();
		
	}
	
	

}
