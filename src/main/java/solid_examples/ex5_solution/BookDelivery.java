package solid_examples.ex5_solution;

import lombok.AllArgsConstructor;

public abstract class BookDelivery {
  String title;
  Integer userID;

  public abstract void deliver();
}
