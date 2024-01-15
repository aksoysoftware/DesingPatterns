package CopositeDesingPattern.Calisma2;

public class Product implements Component{
	
	private String name;
	private double price;
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public void showPrice() {
	System.out.println(this.getPrice());	
		
	}
	
	

}
