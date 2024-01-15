package VisitorDesingPattern.SinavSorusu;

public interface IVisitor {
	
	boolean visit(Authorized authorized);
    boolean visit(OtherEmployer otherEmployer);

}
