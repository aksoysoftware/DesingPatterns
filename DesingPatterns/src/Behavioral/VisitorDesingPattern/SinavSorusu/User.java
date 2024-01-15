package VisitorDesingPattern.SinavSorusu;

public interface User {
	public boolean ReadAccount();
    boolean accept(IVisitor visitor);

}
