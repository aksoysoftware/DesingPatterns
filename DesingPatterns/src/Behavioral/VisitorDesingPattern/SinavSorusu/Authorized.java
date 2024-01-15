package VisitorDesingPattern.SinavSorusu;


public class Authorized implements User{

    private String no;
    
    Authorized(String no) {
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
        return true;
    }

    @Override
    public boolean accept(IVisitor visitor) {
    	return visitor.visit(this);
    	
    }
	

}
