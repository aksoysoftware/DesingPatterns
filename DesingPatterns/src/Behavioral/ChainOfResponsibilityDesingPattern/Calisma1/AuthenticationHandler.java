package ChainOfResponsibilityDesingPattern.Calisma1;

import java.util.HashMap;

public class AuthenticationHandler extends Handler{
	 // Kullanıcı adı ve şifreleri tutmak için bir HashMap tanımlanır
    private HashMap<String, String> users;
    

    
    

    // Kimlik doğrulama işleyicisini oluşturmak için bir kurucu metod tanımlanır
    public AuthenticationHandler() {
    	
    	
        users = new HashMap<>();
        // Örnek olarak bazı kullanıcılar eklenir
        users.put("admin", "1234");
        users.put("user", "abcd");
    }

    // İstekleri işlemek için handle metodunu override eder
    @Override
    public String handle(Request request) {
        // İsteğin içerdiği kullanıcı adı ve şifreyi alır
        String username = request.getUsername();
        String password = request.getPassword();

        // Kullanıcı adı ve şifrenin doğruluğunu kontrol eder
        if (users.containsKey(username) && users.get(username).equals(password)) {
            // Doğruysa, zincirdeki bir sonraki işleyiciye iletir veya zincirin sonuna gelinmişse bir yanıt döndürür
            if (next != null) {
            	System.out.println(next.toString());
                return next.handle(request);// bir sonraki zincire gecer
            } else {
            	
                return "Sipariş işlendi";
            }
        } else {
            // Yanlışsa, bir hata mesajı döndürür
            return "Hatalı kullanıcı adı veya şifre";
        }
    }

   
}
