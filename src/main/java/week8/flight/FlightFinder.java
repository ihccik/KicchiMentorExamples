package week8.flight;

import java.io.IOException;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FlightFinder {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to DJR FLIGHT FINDER Application");
    System.out.println("Our Captain is Glenio from Brasil");
    System.out.println("He performs all our flight I don't know how");
    System.out.println("Our current Departures\n(1) Shangai\n(2) Kyiv\n(3) Adana\n(4) Ankara\n(5) New York\n(6) Rio De Janeiro");
    System.out.println("Select your Departure City by its ID");
    int departureCityId = scanner.nextInt();
    String selectedDepartureCity = "";
    switch (departureCityId){
      case 1:
        selectedDepartureCity = "Shangai"; break;
      case 2:
        selectedDepartureCity = "Kyiv"; break;
      case 3:
        selectedDepartureCity = "Adana"; break;
      case 4:
        selectedDepartureCity = "Ankara"; break;
      case 5:
        selectedDepartureCity = "New York"; break;
      case 6:
        selectedDepartureCity = "Rio De Janeiro"; break;
      default:
        throw new InputMismatchException("Select from 1 to 6 inclusive");
    }

    System.out.println("Select your Arrival City by its ID");
    int arrivalCityId = scanner.nextInt();
    String selectedArrivalCity = "";
    switch (arrivalCityId){
      case 1:
        selectedArrivalCity = "Shangai"; break;
      case 2:
        selectedArrivalCity = "Kyiv"; break;
      case 3:
        selectedArrivalCity = "Adana"; break;
      case 4:
        selectedArrivalCity = "Ankara"; break;
      case 5:
        selectedArrivalCity = "New York"; break;
      case 6:
        selectedArrivalCity = "Rio De Janeiro"; break;
      default:
        throw new InputMismatchException("Select from 1 to 6 inclusive");
    }

    System.out.println("Are you looking for Direct Flights only? (y for yes) (n for no)");
    boolean isDirectFlight = scanner.next().equalsIgnoreCase("y");

    Scanner scanFromDatabase = new Scanner(Path.of("src/week8/flight-finder-database.txt"));
    scanFromDatabase.nextLine();
    while (scanFromDatabase.hasNextLine()){
      String row = scanFromDatabase.nextLine();
      Flight flight = new Flight();

      flight.departureCity = row.substring(0, row.indexOf(';'));
      row = row.substring(row.indexOf(';') + 1);

      flight.arrivalCity = row.substring(0, row.indexOf(';'));
      row = row.substring(row.indexOf(';') + 1);

      flight.date = row.substring(0, row.indexOf(';'));
      row = row.substring(row.indexOf(';') + 1);

      flight.isDirectFlight = row.substring(0, row.indexOf(';')).equals("1");
      row = row.substring(row.indexOf(';') + 1);

      flight.fare = Integer.parseInt(row);

      if (flight.departureCity.equals(selectedDepartureCity) && flight.arrivalCity.equals(selectedArrivalCity)) {
        System.out.println("from " + flight.departureCity + " to " + flight.arrivalCity + " on " + flight.date + " " +
            (isDirectFlight ? "Direct Flight" : "With Transfer") + " One passenger fare" + flight.fare + "$");
      }
    }
    scanFromDatabase.close();
  }
}
