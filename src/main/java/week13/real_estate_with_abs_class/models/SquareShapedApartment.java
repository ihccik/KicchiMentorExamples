package week13.real_estate_with_abs_class.models;

public class SquareShapedApartment extends Apartment{
  private int side;

  public SquareShapedApartment(String name, int side) {
    super(name, "Square");
    this.side = side;
  }

  @Override
  public double getArea() {
    return side*side;
  }
}
