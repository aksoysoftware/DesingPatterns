package Creational.Builder2;

public class Main {
	
	/*;
	 * Builder deseni çünkü
	 * Esneklik sağlamak:  
	 * Örneğin, bir üçgen ya da kare oluşturmak için aynı builder'ı kullanabilir, 
	 * sadece parametreleri değiştirerek farklı şekiller elde edebilirsiniz.
	 * 
	 * Bu örnekte start point için esneklik sağladım.
	 * Fakat şekiller içinde builderlar yaratılabilir.
	 * 
	 * */
	
	public static void main(String[] args) {
		Point startPoint = new Point(0, 0);

	    Shape square = new ShapeBuilder(4, startPoint)
	            .edgeLength(10)
	            .edgeThickness(2)
	            .edgeColor("Black")
	            .fillColor("Red")
	            .build();

	    Shape triangle = new ShapeBuilder(3, startPoint)
	    		.edgeLength(5)
	    		.edgeThickness(2)
	    		.edgeColor("Yellow")
	    		.fillColor("White")
	    		.build();
	    
	    System.out.println(square.toString());
	    System.out.println(triangle.toString());
	}
	
    
}

