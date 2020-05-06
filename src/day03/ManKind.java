package day03;

public class ManKind {
  private int sex;
  private int salary;
  public void manOrWoman() {

  }

  public static void main(String[] args) {
    System.out.println(new Father().getName());
    System.out.println(new Son().getName());
  }
}

class Father {
  private String name = "Father";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

class Son extends Father {
  public String name= "son";

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }
}