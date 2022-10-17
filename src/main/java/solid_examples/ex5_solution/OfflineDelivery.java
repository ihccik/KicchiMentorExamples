package solid_examples.ex5_solution;

public abstract class OfflineDelivery extends BookDelivery{
  public abstract Location getDeliveryLocation();

  @Override
  public void deliver() {
    System.out.println(title + " is delivered to " + getDeliveryLocation().toString());
  }
}
