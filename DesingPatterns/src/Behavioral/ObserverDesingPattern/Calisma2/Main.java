package ObserverDesingPattern.Calisma2;

public class Main {
	
	public static void main(String[] args) {
        User sefa = new User("Sefa Aras", "sefa@ktu.edu");
        User hakan = new User("Hakan Bozkurt", "hakan@ktu.edu");
        
        Product bilgisayar = new Product("Bilgisayar", 100);
        
        System.out.println("1. Teklif");
        bilgisayar.offerProduct(sefa, 50);
        System.out.println("2. Teklif");
        bilgisayar.offerProduct(hakan, 150);
        System.out.println("3. Teklif");
        bilgisayar.offerProduct(sefa, 200);
        System.out.println("4. Teklif");
        bilgisayar.offerProduct(hakan, 250);

	}

}
