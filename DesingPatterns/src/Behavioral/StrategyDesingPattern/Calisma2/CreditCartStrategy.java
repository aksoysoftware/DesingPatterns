package StrategyDesingPattern.Calisma2;

public class CreditCartStrategy  implements PaymentStrategy{

	private String name;
	private String cartNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCartStrategy (String nm, String ccNum, String cvv, String expiryDate) {
	    this.name=nm;
	    this.cartNumber=ccNum;
	    this.cvv=cvv;
	    this.dateOfExpiry=expiryDate;
	  }
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCartNumber() {
		return cartNumber;
	}


	public void setCartNumber(String cartNumber) {
		this.cartNumber = cartNumber;
	}


	public String getCvv() {
		return cvv;
	}


	public void setCvv(String cvv) {
		this.cvv = cvv;
	}


	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount+"kredi karti ile odendi");
	}

}
