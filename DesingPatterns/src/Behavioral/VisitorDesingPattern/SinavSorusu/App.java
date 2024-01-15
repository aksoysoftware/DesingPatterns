package VisitorDesingPattern.SinavSorusu;

public class App {
	
	public static void main(String[] args) {
			Authorized a1 = new Authorized("12345");
	        OtherEmployer oE1 = new OtherEmployer("1234");
	    
	        System.out.println(a1.ReadAccount());
	        System.out.println(oE1.ReadAccount());
	    
	        IDReader idReader = new IDReader();
	                
	        System.out.println(a1.accept(idReader));
	        System.out.println(oE1.accept(idReader)); 
	}

}
