package day01;

public class Student {
  String name;
  int age;
  String school;
  String major;

  public Student () {
  }
  public Student (String n, int a) {
    this.name = n;
    this.age = a;
  }
  public Student (String n, int a, String s) {
    this.name = n;
    this.age = a;
    this.school = s;
  }
  public Student (String n, int a, String s, String m) {
    this.name = n;
    this.age = a;
    this.school = s;
    this.major = m;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }
}
