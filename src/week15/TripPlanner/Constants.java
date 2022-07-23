package week15.TripPlanner;

public class Constants {
  public static final double GASOLINE_LITER_PER_KILOMETER = 0.5d;
  public static final double GASOLINE_LITER_PRICE = 3.75d;
  public static final String TRIP_POSTPONED_MESSAGE = "Trip should be postponed. Sorry :(";
  public static final int UNIT_REPRESENTED_DISTANCE = 250;

  public static double getGasolineExpense(int distance){
    return GASOLINE_LITER_PER_KILOMETER * (double) distance * GASOLINE_LITER_PRICE * UNIT_REPRESENTED_DISTANCE;
  }
}
