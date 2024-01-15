package VisitorDesingPattern.Calisma2;

public class Book implements ItemElement{
	
	private int price;
	private String isbnNumber;
	
	
	public Book(int price, String isbnNumber) {
		super();
		this.price = price;
		this.isbnNumber = isbnNumber;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getIsbnNumber() {
		return isbnNumber;
	}


	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}


	@Override
	public int accept(ShoppingCartVisitor visitor) {
			return visitor.visit(this);
	}
	
	

}
