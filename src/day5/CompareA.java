package day5;

public interface CompareA {
    public static void method1() {
        System.out.println("static method");
    }

    public default void method2() {
        System.out.println("default method");
    }
}

class SubClass implements CompareA {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.method2();
        CompareA.method1();
    }
}