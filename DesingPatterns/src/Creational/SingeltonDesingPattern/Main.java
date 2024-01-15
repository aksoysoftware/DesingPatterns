package SingeltonDesingPattern;

import SingeltonDesingPattern.Version3.SingeltonVersion3;

public class Main {
    public static void main(String[] args) {
        // Thread'lerin Singleton örneğine aynı anda erişmesini simüle etmek için kullanılacak olan Runnable implementasyonu
        Runnable runnable = () -> {
            SingeltonVersion3 singleton = SingeltonVersion3.getInstance();
            System.out.println("Thread " + Thread.currentThread().getId() + " Singleton HashCode: " + singleton.hashCode());
        };

        // Belirli sayıda thread oluşturarak Singleton'a aynı anda erişmelerini sağlama
        int threadCount = 5;
        Thread[] threads = new Thread[threadCount];

        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(runnable);
            threads[i].start();
        }

        // Thread'lerin tamamlanmasını beklemek için kullanılır
        for (int i = 0; i < threadCount; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
