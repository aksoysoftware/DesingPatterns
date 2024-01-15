package VisitorDesingPattern.Calisma1;

public class Lion implements Animal {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitLion(this);
		
	}

	
	
}
