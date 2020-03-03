public class Circle {
  double radius;
  public double findArea() {
    return Math.PI * Math.pow(radius, 2);
  }
}

class PassObject {
  public void printArea(Circle c, int time) {
    String tab = "\t\t\t\t\t\t\t";
    System.out.println("radius" + tab+"area");
    for (int i = 1; i < time + 1; i++) {
      c.radius = i;
      double area = c.findArea();
      System.out.println(c.radius  + "\t"+ tab + area);
    }
  }
}

class CircleTest {
  public static void main(String[] args) {
    PassObject passObject = new PassObject();
    Circle circle = new Circle();
    passObject.printArea(circle, 5);
    System.out.println("now radius is "+circle.radius);
  }
}

class Triangle {
  private double base;
  private double height;

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}

class TriangleTest {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(1.0, 2.0);
    double base = triangle.getBase();
    double height = triangle.getHeight();
    System.out.println(base * height / 2);
  }
}

