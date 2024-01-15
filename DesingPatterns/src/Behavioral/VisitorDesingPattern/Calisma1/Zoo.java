package VisitorDesingPattern.Calisma1;

public class Zoo {
	
	public static void main(String[] args) {
		Animal lion = new Lion();
		Animal giraffe = new Giraffe();
		
		
		Visitor soundVisitor= new SoundVisitor();
		
		lion.accept(soundVisitor);
		giraffe.accept(soundVisitor);
	}

}
