package week13.real_estate_with_interface.models;

import week13.real_estate_with_interface.IApartmentCalculations;

public class CircleShapedApartment extends Apartment implements IApartmentCalculations {
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