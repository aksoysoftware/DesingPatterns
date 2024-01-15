package ObserverDesingPattern.Calisma2;

public class User implements Observer{
	
	private String name;
	private String email;
	
	
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public void notifyPriceChange(Product product) {
		System.out.println(getName() + " kullanıcısına fiyat değişimi (" + product.getPrice() + ") mail olarak bildirildi.");
		
	}


	
	
	
	
	

}
