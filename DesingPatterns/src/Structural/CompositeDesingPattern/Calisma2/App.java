package CopositeDesingPattern.Calisma2;

public class App {

	 public static void main(String[] args) {
	        // Ürünler
	        Product mouse = new Product("Mouse", 50);
	        Product keyboard = new Product("Keyboard", 100);
	        Product monitor = new Product("Monitor", 500);
	        Product cpu = new Product("CPU", 1000);

	        // Kutular
	        Box smallBox = new Box("Small Box");
	        Box bigBox = new Box("Big Box");

	        // Küçük kutuya mouse ve keyboard ekle
	        smallBox.addComponent(mouse);
	        smallBox.addComponent(keyboard);

	        // Büyük kutuya monitor, cpu ve küçük kutu ekle
	        bigBox.addComponent(monitor);
	        bigBox.addComponent(cpu);
	        bigBox.addComponent(smallBox);

	        // Büyük kutunun fiyatını göster
	        bigBox.showPrice();
	    }
	
}
