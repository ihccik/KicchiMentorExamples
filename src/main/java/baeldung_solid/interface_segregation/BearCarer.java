package baeldung_solid.interface_segregation;

public class BearCarer implements BearCleaner, BearFeeder {

  public void washTheBear() {
    //I think we missed a spot...
  }

  public void feedTheBear() {
    //Tuna Tuesdays...
  }
}
