package VisitorDesingPattern.SinavSorusu;

public class IDReader implements IVisitor {

	@Override
    public boolean visit(Authorized authorized) {
        return true;   
    }

    @Override
    public boolean visit(OtherEmployer otherEmployer) {
        return false;
    }   

}
