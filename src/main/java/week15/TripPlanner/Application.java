package week15.TripPlanner;

import java.util.Arrays;
import java.util.Scanner;
import week15.TripPlanner.enums.EClub;
import week15.TripPlanner.enums.EDays;
import week15.TripPlanner.exceptions.NotAllowedInputException;
import week15.TripPlanner.exceptions.TripPostponedException;
import week15.TripPlanner.modals.City;
import week15.TripPlanner.modals.Driver;
import week15.TripPlanner.modals.Student;
import week15.TripPlanner.modals.Teacher;

public class Application {

  private static int totalBudget;
  private static double totalGasExpense;
  private static City targetCity;
  private static City cityLosAngeles;
  private static String day;
  private static Scanner scanner;

  static {
    scanner = new Scanner(System.in);
    cityLosAngeles = Database.cities.stream().filter(c -> c.getName().equals("Los Angeles")).findFirst().get();

    String asdh = "Sebastian \" is a good guy";
  }

  public static void main(String[] args) {
    System.out.println("University of California students and teachers are searching for a trip.");

    do {
      try{
        startProgram();
      }
      catch (NotAllowedInputException ex){
        System.out.println(ex.getMessage());
      }
      catch (TripPostponedException ex){
        System.out.println(ex.getMessage());
        clearFields();
      }
      catch (Exception ex){
        System.out.println("Unknown error occurred. Please try again.");
      }
      finally {

      }
    }while (true);
  }

  private static void startProgram(){
    setTargetCity();
    setDay();
    checkDriverAvailability();
    checkStudentsAvailability();
    checkTeacherAvailability();

    int distance = cityLosAngeles.getDistance(targetCity);
    totalGasExpense = Constants.getGasolineExpense(distance);
    printBudgetAndGasExpense();
    checkBudgetAndGasExpense();
  }

  private static void clearFields(){
    targetCity = null;
    day = null;
  }

  private static void setDay(){
    if (day != null)
      return;

    printSeparator();
    System.out.println("Select the trip day");
    Arrays.stream(EDays.values()).forEach(d -> System.out.println(d.name()));
    day = scanner.nextLine().toUpperCase();

    if (Arrays.stream(EDays.values()).noneMatch(d -> d.name().equalsIgnoreCase(day))){
      day = null;
      throw new NotAllowedInputException("Select day appropriately");
    }
  }

  private static void printSeparator(){
    System.out.println("********************************");
  }

  private static void setTargetCity(){
    if (targetCity != null)
      return;

    printSeparator();
    System.out.println("Select the target city for the trip");
    printCities();
    String targetCityName = scanner.nextLine();

    for (City city : Database.cities) {
      if (city.getName().equalsIgnoreCase(targetCityName)) {
        targetCity = city;
        break;
      }
    }

    if (targetCity == null)
      throw new NotAllowedInputException("Please select Target City properly.");
  }

  private static void checkDriverAvailability(){
    printSeparator();
    Driver driver = Database.getDriver();
    if (driver.isAvailable(day)){
      System.out.println("Driver " + driver.getName() + " is available for " + day);
    }
    else {
      System.out.println("Driver " + driver.getName() + " is not available for " + day);
      throw new TripPostponedException();
    }
  }

  private static void printCities(){
    for (City city : Database.cities) {
      if (!city.getName().equalsIgnoreCase(cityLosAngeles.getName()))
        System.out.println(city.getName());
    }
  }

  private static void checkBudgetAndGasExpense(){
    double diff = totalBudget - totalGasExpense;

    if (totalBudget >= totalGasExpense){
      System.out.println("Congrats. You can do " + targetCity.getName() + " trip");
      System.out.println("Your new balance after decreasing gasoline price is " + diff + "$");
    }
    else {
      System.out.println("So sorry. You can not do " + targetCity.getName() + " trip.");
      System.out.println("Your need " + diff + "$ for gasoline expense.");
    }
  }

  private static void printBudgetAndGasExpense(){
    System.out.println("Total Budget: " + totalBudget);
    System.out.println("Total Gasoline Expense: " + totalGasExpense);
  }

  private static void checkStudentsAvailability(){
    printSeparator();
    System.out.println("Available Students");

    boolean anyStudentAvailable = false;
    for (Student student : Database.getStudents()) {
      if (student.isAvailable(day)){
        System.out.println("Student " + student.getName() + "s schedule is available. His/her budget is " + student.getBudget());
        totalBudget += student.getBudget();
        anyStudentAvailable = true;
      }
    }

    if (!anyStudentAvailable) {
      System.out.println("Any of the students' schedule are not available for the trip");
      throw new TripPostponedException();
    }
  }

  private static void checkTeacherAvailability(){
    printSeparator();
    System.out.println("Available Teachers");

    boolean anyTeacherAvailable = false;
    for (Teacher teacher:Database.getTeachers()) {
      if (teacher.isAvailable(day) && teacher.getClubs() != null && teacher.getClubs().contains(
          EClub.TRAVELERS.name())){
        System.out.println("Teacher " + teacher.getName() + "s schedule and club is available. His/her budget is " + teacher.getBudget());
        totalBudget += teacher.getBudget();
        anyTeacherAvailable = true;
      }
    }

    if (!anyTeacherAvailable) {
      System.out.println("Any of the teachers' schedule and club are not available for the trip");
      throw new TripPostponedException();
    }
  }
}
