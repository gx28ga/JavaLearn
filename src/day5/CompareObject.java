package day5;

public interface CompareObject {
    public int compareTo(Object o);
}

class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}

class ComparableCircle extends Circle implements CompareObject {

    @Override
    public int compareTo(Object o) {
        if (o == this) {
            return 0;
        }
        if (o instanceof ComparableCircle) {
            ComparableCircle c = (ComparableCircle)o;
            if (this.getRadius() > c.getRadius()) {
                return 1;
            } else if (this.getRadius() < c.getRadius()) {
                return -1;
            } else {
                return 0;
            }
        } else {
            throw new RuntimeException("传入类型不匹配");
        }
    }
}