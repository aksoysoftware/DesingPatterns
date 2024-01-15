package SingeltonDesingPattern.Version3;

public class SingeltonVersion3 {
	
	
	// private static INSTANCE
	private static SingeltonVersion3 INSTANCE;
	
	// private constuructor
	private SingeltonVersion3() {
		// TODO Auto-generated constructor stub
	}

	
	
	public static SingeltonVersion3 getInstance() {
		
		if (INSTANCE==null) {
			
			INSTANCE = new SingeltonVersion3();
		}
		return INSTANCE;
		
	}
}
