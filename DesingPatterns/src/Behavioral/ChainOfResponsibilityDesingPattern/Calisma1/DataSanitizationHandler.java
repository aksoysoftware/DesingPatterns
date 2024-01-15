package ChainOfResponsibilityDesingPattern.Calisma1;

public class DataSanitizationHandler extends Handler {

	
	
	 // İstekleri işlemek için handle metodunu override eder
    @Override
    public String handle(Request request) {
        // İsteğin içerdiği veriyi alır
        String data = request.getData();

        // Veriyi sterilize etmek için bir algoritma uygular (örnek olarak küçük harfe çevirir)
        data = data.toLowerCase();

        
      

        // Zincirdeki bir sonraki işleyiciye iletir veya zincirin sonuna gelinmişse bir yanıt döndürür
        if (next != null) {
        	System.out.println(next.toString());
            return next.handle(request);
        } else {
            return "Sipariş işlendi";
        }
    }
}
