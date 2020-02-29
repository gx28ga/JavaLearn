public class UserTest {


    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.addAge(12));
    }
}

class User {
    String name;
    int age;
    int sex;
    public void study() {

    }
    public void showAge() {

    }

    public int addAge(int i) {
        age += i;
        return age;
    }
}

class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 3;
        System.out.println(circle.findArea());
    }
}

class Circle {
    double radius;

    public double findArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}