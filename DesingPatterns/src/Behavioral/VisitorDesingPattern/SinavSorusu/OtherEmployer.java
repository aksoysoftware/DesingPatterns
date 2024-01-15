package VisitorDesingPattern.SinavSorusu;

public class OtherEmployer implements User{

	private String no;  
    
    OtherEmployer(String no) {
        this.no = no;
    }
       
	
	public String getNo() {
		return no;
	}


	public void setNo(String no) {
		this.no = no;
	}


	@Override
	public boolean ReadAccount() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean accept(IVisitor visitor) {
		return visitor.visit(this);
	}

}
