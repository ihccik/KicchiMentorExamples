package week13.real_estate_with_abs_class.models;

public class CircleShapedApartment extends Apartment {
  private int radius;

  public CircleShapedApartment(String name, int radius) {
    super(name, "Circle");
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }
}
