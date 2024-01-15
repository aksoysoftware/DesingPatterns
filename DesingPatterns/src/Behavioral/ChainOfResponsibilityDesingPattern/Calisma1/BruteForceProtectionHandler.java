package ChainOfResponsibilityDesingPattern.Calisma1;

import java.util.HashMap;

public class BruteForceProtectionHandler extends Handler {
    // IP adreslerinin başarısız giriş sayılarını tutmak için bir HashMap tanımlanır
    private HashMap<String, Integer> failedAttempts;

    // Brute force koruması işleyicisini oluşturmak için bir kurucu metod tanımlanır
    public BruteForceProtectionHandler() {
        failedAttempts = new HashMap<>();
    }

    // İstekleri işlemek için handle metodunu override eder
    @Override
    public String handle(Request request) {
        // İsteğin geldiği IP adresini alır (örnek olarak 192.168.1.1 olarak varsayalım)
        String ip = "192.168.1.1";

        // IP adresinin başarısız giriş sayısını alır veya yoksa 0 olarak varsayalım
        int count = failedAttempts.getOrDefault(ip, 0);

        // Başarısız giriş sayısı 3'ten fazlaysa, bir hata mesajı döndürür
        if (count > 3) {
            return "Çok fazla başarısız giriş denemesi";
        } else {
            // Başarısız giriş sayısını bir artırır ve HashMap'e yazar
            count++;
            failedAttempts.put(ip, count);

            // Zincirdeki bir sonraki işleyiciye iletir veya zincirin sonuna gelinmişse bir yanıt döndürür
            if (next != null) {
            	System.out.println(next.toString());
                return next.handle(request);
            } else {
                return "Sipariş işlendi";
            }
        }
    }
}
