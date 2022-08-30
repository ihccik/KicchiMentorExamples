package week13.real_estate_with_abs_class.models;

public class RectangleShapedApartment extends Apartment {
  private int width, length;

  public RectangleShapedApartment(String name, int width, int length) {
    super(name, "Rectangle");
    this.width = width;
    this.length = length;
  }

  @Override
  public double getArea() {
    return width*length;
  }
}
