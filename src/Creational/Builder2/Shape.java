package Creational.Builder2;



public class Shape {
	 private int edgeCount;
	    private Point startPoint;
	    private int edgeLength;
	    private int edgeThickness;
	    private String edgeColor;
	    private String fillColor;

	    Shape(int edgeCount, Point startPoint, int edgeLength, int edgeThickness, String edgeColor, String fillColor) {
	        this.edgeCount = edgeCount;
	        this.startPoint = startPoint;
	        this.edgeLength = edgeLength;
	        this.edgeThickness = edgeThickness;
	        this.edgeColor = edgeColor;
	        this.fillColor = fillColor;
	    }

	    public int getEdgeCount() {
	        return edgeCount;
	    }

	    public Point getStartPoint() {
	        return startPoint;
	    }

	    public int getEdgeLength() {
	        return edgeLength;
	    }

	    public int getEdgeThickness() {
	        return edgeThickness;
	    }

	    public String getEdgeColor() {
	        return edgeColor;
	    }

	    public String getFillColor() {
	        return fillColor;
	    }

	    @Override
	    public String toString() {
	        return "Shape{" +
	                "edgeCount=" + edgeCount +
	                ", startPoint=" + startPoint +
	                ", edgeLength=" + edgeLength +
	                ", edgeThickness=" + edgeThickness +
	                ", edgeColor='" + edgeColor + '\'' +
	                ", fillColor='" + fillColor + '\'' +
	                '}';
	    }

}
