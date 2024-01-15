package VisitorDesingPattern.Calisma1;

public class SoundVisitor implements Visitor{

	@Override
	public void visitLion(Lion lion) {
		System.out.println("Aslan Kükredi");
		
	}

	@Override
	public void visitGiraffe(Giraffe giraffe) {
		System.out.println("Zurafa sesi yok ve uzun!");
	}

}
