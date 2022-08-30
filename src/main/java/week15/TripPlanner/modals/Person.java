package week15.TripPlanner.modals;

import week15.TripPlanner.exceptions.NotAllowedInputException;

public abstract class Person {
  private String name;

  protected Person(String name){
    setName(name);
  }

  private void setName(String name) {
    if (name.isEmpty())
      throw new NotAllowedInputException("Name can not be empty");

    this.name = name;
  }

  public String getName() {
    return name;
  }
}
