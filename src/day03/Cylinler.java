package day03;

public class Cylinler extends Circle{
  private double length;

  public Cylinler () {
    length = 1.0;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double findVolume() {
    return this.findArea() * this.length;
  }
}
