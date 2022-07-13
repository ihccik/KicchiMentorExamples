package week13.real_estate_with_interface.program;

import java.util.ArrayList;
import java.util.Arrays;
import week13.real_estate_with_interface.IApartmentCalculations;
import week13.real_estate_with_interface.models.CircleShapedApartment;
import week13.real_estate_with_interface.models.RectangleShapedApartment;
import week13.real_estate_with_interface.models.SquareShapedApartment;

public class ApartmentDatabase {

  public static final ArrayList<IApartmentCalculations> apartmentCalculations = new ArrayList<>(
      Arrays.asList(
                      new SquareShapedApartment("Seaview Apartments", 20),
                      new SquareShapedApartment("House of Lords", 25),
                      new SquareShapedApartment("The Twin Towers", 30),
                      new CircleShapedApartment("One Circular Quay", 15),
                      new CircleShapedApartment("Hillside Apartments", 20),
                      new CircleShapedApartment("The Peak", 10),
                      new RectangleShapedApartment("Skyline Condo", 20, 30),
                      new RectangleShapedApartment("Broadway Lofts", 20, 25)
      )
  );
}
