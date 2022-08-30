package week15.TripPlanner.modals;

import week15.TripPlanner.Database;
import week15.TripPlanner.TripActions;

public class Driver extends Person implements TripActions {

  public Driver(String name) {
    super(name);
  }

  @Override
  public boolean isAvailable(String day) {
    return Database.getSchedule().get(day);
  }
}
