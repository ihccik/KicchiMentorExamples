package week13.real_estate_with_interface.models;

import week13.real_estate_with_interface.IApartmentCalculations;

public class SquareShapedApartment extends Apartment implements IApartmentCalculations {
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