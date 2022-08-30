package week13.real_estate_with_abs_class.program;

import java.util.Scanner;
import week13.real_estate_with_abs_class.models.Apartment;

public class RealEstateProgram {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("Enter the required space");
      double requiredSpace = scanner.nextDouble();

      for(Apartment apartment : ApartmentDatabase.apartmentList){
        if (apartment.getArea() >= requiredSpace){
          System.out.println(apartment.getName() + " (" + apartment.getShape()  + ") : " + apartment.getArea());
        }
      }

    }while (!scanner.next().equals("yes"));

    System.out.println("Exited from Real Estate Program");
    scanner.close();
  }
}
