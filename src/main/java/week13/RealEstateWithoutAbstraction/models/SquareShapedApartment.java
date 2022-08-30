package week13.RealEstateWithoutAbstraction.models;

public class SquareShapedApartment extends Apartment {
  private int side;

  public SquareShapedApartment(String name, int side) {
    super(name, "Square");
    this.side = side;
  }

  public double getArea() {
    return side*side;
  }
}