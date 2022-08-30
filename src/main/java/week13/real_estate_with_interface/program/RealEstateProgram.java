package week13.real_estate_with_interface.program;

import java.util.Scanner;
import week13.real_estate_with_interface.IApartmentCalculations;
import week13.real_estate_with_interface.models.Apartment;
import week13.real_estate_with_interface.program.ApartmentDatabase;

/*
A real estate agent asked you to write a program. He said that he has properties in the shapes of squares, rectangles,
circles, etc., and that he wants to market them by filtering according to the square meters in line with the wishes of his customers.

Tips:
Each property's name and features will be kept as separate ArrayList's in the same order.
Define an interface to calculate the area and subclasses to calculate the area of each shape.
Write a method that will take all the name and features of real estate agent's properties as separate lists and return a property name list
whose areas are equal or more than the request of a client.

Example:
input :
properties of real estate agent :
squares s1 with 20 m side, s2 with 25 m side, s3 with 30 m side
rectangles r1 with 20 x 30, r2 with 20 x 25
circles c1 with 15 m radius, 20 m radius, 10 m radius
customer request : min 600 square meters

        ArrayList<Shape> list = new ArrayList<>(Arrays.asList(
                new Square(20),new Square(25),new Square(30),
                new Rectangle(30, 20), new Rectangle(20, 25),
                new Circle(15), new Circle(20), new Circle(10)));
        ArrayList<String> names = new ArrayList<>(Arrays.asList("s1", "s2", "s3", "r1", "r2", "c1", "c2", "c3"));
        System.out.println(filterProperties(names, list, 600));

output :
[s2, s3, r1, c1, c2]

 */

public class RealEstateProgram {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("Enter the required space");
      double requiredSpace = scanner.nextDouble();

      for(IApartmentCalculations apartmentCalculations : ApartmentDatabase.apartmentCalculations){
        if (apartmentCalculations.getArea() >= requiredSpace){
          Apartment currentApartment = (Apartment)apartmentCalculations;
          System.out.println(currentApartment.getName() + " (" + currentApartment.getShape()  + ") : " + apartmentCalculations.getArea());
        }
      }

    }while (!scanner.next().equals("yes"));

    System.out.println("Exited from Real Estate Program");
    scanner.close();
  }
}