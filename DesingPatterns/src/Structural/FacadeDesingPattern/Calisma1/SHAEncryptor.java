package Structural.Facade;

 class SHAEncryptor {

	public void encryptor(String text , String key,boolean type) {
		
		if (type) {
			System.out.println("<SHA>"+ text +key+"<SHA>");
		}
		else {
			 System.out.println("<SHA>"+ text +key+"<SHA>");
		}
		
	}
	
}
