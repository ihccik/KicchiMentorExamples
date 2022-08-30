package week13.real_estate_with_interface.models;

import week13.real_estate_with_interface.IApartmentCalculations;

public class RectangleShapedApartment extends Apartment implements IApartmentCalculations {

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
