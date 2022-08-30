package week15.TripPlanner.modals;

import java.util.List;
import java.util.Map;

public class Teacher extends Stuff{
  private List<String> clubs;
  public Teacher(String name, Map<String, Boolean> schedule, double budget, List<String> clubs) {
    super(name, schedule, budget);
    this.clubs = clubs;
  }

  public List<String> getClubs() {
    return clubs;
  }
}
