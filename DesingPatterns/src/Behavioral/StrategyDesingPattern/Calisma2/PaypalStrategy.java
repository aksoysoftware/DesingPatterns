package StrategyDesingPattern.Calisma2;

public class PaypalStrategy implements PaymentStrategy {

	
	private String emailId;
	  private String password;

	  public PaypalStrategy (String email, String pwd) {
	    this.emailId=email;
	    this.password=pwd;
	  }

	 
	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		
	}

}
