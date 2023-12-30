package Creational.Builder2;

public class ShapeBuilder {
	private int edgeCount;
    private Point startPoint;
    private int edgeLength;
    private int edgeThickness;
    private String edgeColor;
    private String fillColor;

    public ShapeBuilder(int edgeCount, Point startPoint) {
        this.edgeCount = edgeCount;
        this.startPoint = startPoint;
    }

    public ShapeBuilder edgeLength(int edgeLength) {
        this.edgeLength = edgeLength;
        return this;
    }

    public ShapeBuilder edgeThickness(int edgeThickness) {
        this.edgeThickness = edgeThickness;
        return this;
    }

    public ShapeBuilder edgeColor(String edgeColor) {
        this.edgeColor = edgeColor;
        return this;
    }

    public ShapeBuilder fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public Shape build() {
        return new Shape(edgeCount, startPoint, edgeLength, edgeThickness, edgeColor, fillColor);
    }
	
}
