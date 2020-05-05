package day3;

public class MyRectangle extends GeometricObject {
    protected double width;
    protected double height;

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    @Override
    public double findArea() {
        return width * height;
    }
}
