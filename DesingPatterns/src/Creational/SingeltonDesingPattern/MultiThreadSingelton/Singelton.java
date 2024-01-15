package SingeltonDesingPattern.MultiThreadSingelton;

public class Singelton {
	
	
	//volatine 
	private static volatile Singelton INSTANCE;
	//private constuructor
	private Singelton() {}
	
	
	//double checking Singelton
	public static Singelton getInstance() {
		
		if (INSTANCE == null) {
			synchronized (Singelton.class) {
				if (INSTANCE == null) {
					INSTANCE=new Singelton();
				}
			}
			
		}
		return INSTANCE;
	}

}
