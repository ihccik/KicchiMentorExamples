package solid_examples.ex5_solution;

public abstract class OnlineDelivery extends BookDelivery{
  public abstract String getEmail();

  @Override
  public void deliver() {
    System.out.println(title + " is emailed to " + getEmail());
  }
}
