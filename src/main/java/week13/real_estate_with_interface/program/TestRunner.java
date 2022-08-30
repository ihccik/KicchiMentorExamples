package week13.real_estate_with_interface.program;

import week13.real_estate_with_interface.IApartmentCalculations;
import week13.real_estate_with_interface.models.CircleShapedApartment;

public class TestRunner {

  public static void main(String[] args) {
    IApartmentCalculations apartmentCalculations = new CircleShapedApartment("Top Towers", 12);
  }
}
