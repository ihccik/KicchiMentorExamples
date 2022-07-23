package week15.TripPlanner.modals;

import java.util.Map;
import week15.TripPlanner.exceptions.NotAllowedInputException;
import week15.TripPlanner.TripActions;

public abstract class Stuff extends Person implements TripActions {
  private Map<String, Boolean> schedule;
  private double budget;

  protected Stuff(String name, Map<String, Boolean> schedule, double budget) {
    super(name);
    setSchedule(schedule);
    setBudget(budget);
  }

  public double getBudget() {
    return budget;
  }

  public void setBudget(double budget) {
    if (budget < 0)
      throw new NotAllowedInputException("Budget can not be lesser than 0");

    this.budget = budget;
  }

  public void setSchedule(Map<String, Boolean> schedule) {
    if (schedule == null)
      throw new NotAllowedInputException("Schedule is empty");

    this.schedule = schedule;
  }

  @Override
  public boolean isAvailable(String day) {
    return schedule.get(day.toUpperCase());
  }
}
