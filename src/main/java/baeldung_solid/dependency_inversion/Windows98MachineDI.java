package baeldung_solid.dependency_inversion;

//Now our classes are decoupled and communicate through the Keyboard abstraction.
// If we want, we can easily switch out the type of keyboard in our machine with a different implementation of the interface.
// We can follow the same principle for the Monitor class.
//Excellent! We've decoupled the dependencies and are free to test our Windows98Machine with whichever testing framework we choose.
public class Windows98MachineDI {
  private final Keyboard keyboard;
  private final Monitor monitor;

  public Windows98MachineDI(Keyboard keyboard, Monitor monitor) {
    this.keyboard = keyboard;
    this.monitor = monitor;
  }
}
