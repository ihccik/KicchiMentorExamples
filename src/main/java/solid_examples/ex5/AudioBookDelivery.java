package solid_examples.ex5;

public class AudioBookDelivery extends BookDelivery {

  public AudioBookDelivery(String title, Integer userID) {
    super(title, userID);
  }

  @Override
  public Location getDeliveryLocation() {
    //can't be implemented since Audio book doesn't have a physical location.
    //In this case, we should return null which will throw NullPointerException later
    //Or, we should throw a RunTimeException which will be a problem later, too.
    throw new RuntimeException("not implementable method for audiobooks");
  }
}
