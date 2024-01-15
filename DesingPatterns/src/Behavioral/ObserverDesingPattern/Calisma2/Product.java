package ObserverDesingPattern.Calisma2;

public class Product extends Subject {
	
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
		
		notifyObservers(this);
	}

	public void offerProduct(User user, int newPrice) {
        if (isPriceBigger(newPrice)) {
            setPrice(newPrice);
            addObserver(user);	
        }
    }

    public boolean isPriceBigger(int newPrice) {
        return newPrice > getPrice();
    }

	
	
	
	
	
	

}
