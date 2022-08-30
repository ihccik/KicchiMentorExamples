package week13.RealEstateWithoutAbstraction.program;

import java.util.ArrayList;
import java.util.Arrays;
import week13.RealEstateWithoutAbstraction.models.CircleShapedApartment;
import week13.RealEstateWithoutAbstraction.models.RectangleShapedApartment;
import week13.RealEstateWithoutAbstraction.models.SquareShapedApartment;

public class ApartmentDatabase {
  public static ArrayList<SquareShapedApartment> getSquareShapedApartments(){
    ArrayList<SquareShapedApartment> squareShapedApartmentList = new ArrayList<>(
        Arrays.asList(new SquareShapedApartment("Seaview Apartments", 20),
            new SquareShapedApartment("House of Lords", 25),
            new SquareShapedApartment("The Twin Towers", 30))
    );

    return squareShapedApartmentList;
  }

  public static ArrayList<CircleShapedApartment> getCircleShapedApartments(){
    ArrayList<CircleShapedApartment> circleShapedApartmentList = new ArrayList<>(
        Arrays.asList(new CircleShapedApartment("One Circular Quay", 15),
            new CircleShapedApartment("Hillside Apartments", 20),
            new CircleShapedApartment("The Peak", 10))
    );

    return circleShapedApartmentList;
  }

  public static ArrayList<RectangleShapedApartment> getRectangleShapedApartments(){
    ArrayList<RectangleShapedApartment> rectangleShapedApartmentList = new ArrayList<>(
        Arrays.asList(new RectangleShapedApartment("Skyline Condo", 20, 30),
            new RectangleShapedApartment("Broadway Lofts", 20, 25))
    );

    return rectangleShapedApartmentList;
  }
}
