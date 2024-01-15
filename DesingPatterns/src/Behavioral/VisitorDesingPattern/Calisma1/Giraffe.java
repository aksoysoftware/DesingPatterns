package VisitorDesingPattern.Calisma1;

public class Giraffe implements Animal{

	@Override
	public void accept(Visitor visitor) {
		visitor.visitGiraffe(this);
		
	}

}
