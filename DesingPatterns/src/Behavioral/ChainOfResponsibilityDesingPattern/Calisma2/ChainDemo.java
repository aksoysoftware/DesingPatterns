package ChainOfResponsibilityDesingPattern.Calisma2;

import java.util.Random;

   interface Image {
	  String process();
}
	class IR implements Image{

		@Override
		public String process() {
			// TODO Auto-generated method stub
			return "Ir";
		}
	}

	class LS implements Image {
	    public String process() {
	        return "LS";
	    }
	}
	class Processor {
		
	    private static final Random RANDOM = new Random();
	    private static int nextID = 1;
	    private int id = nextID++;

	    public boolean execute(Image img) {
	        if (RANDOM.nextInt(2) != 0) {
	            System.out.println("   Processor " + id + " is busy");
	            return false;
	        }
	        System.out.println("Processor " + id + " - " + img.process());
	        return true;
	    }
	}
	public class ChainDemo {
	    public static void main( String[] args ) {
	        Image[] inputImages = {new IR(), new IR(), new LS(), new IR(), new LS(), new LS()};
	        Processor[] processors = {new Processor(), new Processor(), new Processor()};
	        for (int i=0, j; i < inputImages.length; i++) {
	            System.out.println("Operation #" + (i + 1) + ":");
	            j = 0;
	            while (!processors[j].execute(inputImages[i])) {
	                j = (j + 1) % processors.length;
	            }
	            System.out.println();
	        }
	    }
	}

