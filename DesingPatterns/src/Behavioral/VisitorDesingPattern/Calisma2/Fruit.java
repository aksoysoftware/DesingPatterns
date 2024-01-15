package VisitorDesingPattern.Calisma2;

public class Fruit implements ItemElement{

	private int pricePerKg;
	private int weight;
	private String name;
	
	
	public Fruit(int pricePerKg, int weight, String name) {
		super();
		this.pricePerKg = pricePerKg;
		this.weight = weight;
		this.name = name;
	}
	public int getPricePerKg() {
		return pricePerKg;
	}
	public void setPricePerKg(int pricePerKg) {
		this.pricePerKg = pricePerKg;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this) ;
	}
	
	
	
}
