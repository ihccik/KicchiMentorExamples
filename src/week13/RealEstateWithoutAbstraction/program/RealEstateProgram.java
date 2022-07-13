package week13.RealEstateWithoutAbstraction.program;

import java.util.Scanner;
import week13.RealEstateWithoutAbstraction.models.CircleShapedApartment;
import week13.RealEstateWithoutAbstraction.models.RectangleShapedApartment;
import week13.RealEstateWithoutAbstraction.models.SquareShapedApartment;

public class RealEstateProgram {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    do{
      System.out.println("Enter the required space");
      double requiredSpace = scanner.nextDouble();

      for(SquareShapedApartment squareShapedApartment : ApartmentDatabase.getSquareShapedApartments()){
        if (squareShapedApartment.getArea() >= requiredSpace){
          System.out.println(squareShapedApartment.getName() + " : " + squareShapedApartment.getArea());
        }
      }

      for(CircleShapedApartment circleShapedApartment : ApartmentDatabase.getCircleShapedApartments()){
        if (circleShapedApartment.getArea() >= requiredSpace){
          System.out.println(circleShapedApartment.getName() + " : " + circleShapedApartment.getArea());
        }
      }

      for(RectangleShapedApartment rectangleShapedApartment : ApartmentDatabase.getRectangleShapedApartments()){
        if (rectangleShapedApartment.getArea() >= requiredSpace){
          System.out.println(rectangleShapedApartment.getName() + " : " + rectangleShapedApartment.getArea());
        }
      }

      System.out.println("Write yes to exit. Or press any key to continue.");

    }while (!scanner.next().equals("yes"));

    System.out.println("Exited from Real Estate Program");
    scanner.close();
  }
}
