// App.java
package ChainOfResponsibilityDesingPattern.Calisma1;

public class App {
    public static void main(String[] args) {
        // Zinciri oluştur
        Handler authenticationHandler = new AuthenticationHandler();
        Handler dataSanitizationHandler = new DataSanitizationHandler();
        Handler bruteForceProtectionHandler = new BruteForceProtectionHandler();

        authenticationHandler.setNext(dataSanitizationHandler);
        dataSanitizationHandler.setNext(bruteForceProtectionHandler);

        // Test isteği oluştur
        Request testRequest = new Request("admin", "1234", "Test Data");

        // Zinciri çalıştır
        String result = authenticationHandler.handle(testRequest);

        
        printHandlerChain(authenticationHandler);
        // Sonucu ve işleyici zincirini yazdır
        System.out.println("Sonuç: " + result);
        
    }

    private static void printHandlerChain(Handler handler) {
        while (handler != null) {
            System.out.println("Handler: " + handler.getClass().getSimpleName());
            handler = handler.next;
        }
    }
}
