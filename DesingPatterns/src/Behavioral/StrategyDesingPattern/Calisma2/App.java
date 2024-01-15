package StrategyDesingPattern.Calisma2;

public class App {
	
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart ();
		cart.addItem (new Item ("1234", 10));
		cart.addItem (new Item ("5678", 20));

		//kredi kartı ile ödeme
		cart.pay (new CreditCartStrategy ("Pankaj Kumar", "1234567890123456", "786", "12/15"));
	}
	

}
