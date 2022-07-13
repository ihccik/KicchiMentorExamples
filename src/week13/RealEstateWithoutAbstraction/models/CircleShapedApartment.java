package week13.RealEstateWithoutAbstraction.models;

public class CircleShapedApartment extends Apartment {
  private int radius;

  public CircleShapedApartment(String name, int radius) {
    super(name, "Circle");
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }
}