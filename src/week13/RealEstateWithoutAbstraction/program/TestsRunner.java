package week13.RealEstateWithoutAbstraction.program;


import week13.RealEstateWithoutAbstraction.models.Apartment;
import week13.RealEstateWithoutAbstraction.models.CircleShapedApartment;

public class TestsRunner {

  public static void main(String[] args) {
    Apartment apart = new Apartment("Top Towers", "Circle");
    CircleShapedApartment circleApart = new CircleShapedApartment("Top Towers", 12);

    Apartment apartFromCircle = ((Apartment) circleApart);
  }


}
