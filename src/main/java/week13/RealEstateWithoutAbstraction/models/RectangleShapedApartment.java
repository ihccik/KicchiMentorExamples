package week13.RealEstateWithoutAbstraction.models;

public class RectangleShapedApartment extends Apartment {

  private int width, length;

  public RectangleShapedApartment(String name, int width, int length) {
    super(name, "Rectangle");
    this.width = width;
    this.length = length;
  }

  public double getArea() {
    return width*length;
  }
}
