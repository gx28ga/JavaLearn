package day4;

public class CircleTest {
    public static void main(String[] args) {

    }
}

class Circle {
    private double radius;
    private int id;
    private static int total;
    private static int init = 1001;
    public Circle() {
        id = init ++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }

    public static int getInit() {
        return init;
    }

    public double findArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
