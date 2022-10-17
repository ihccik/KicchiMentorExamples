package solid_examples.ex6;

public class OnlineCustomerImpl implements RestaurantInterface{

  @Override
  public void acceptOnlineOrder() {
    //logic for placing online order
  }

  @Override
  public void acceptTelephoneOrder() {
    //Not Applicable for Online Order
    throw new UnsupportedOperationException();
  }

  @Override
  public void acceptWalkInCustomerOrder() {
    //Not Applicable for Online Order
    throw new UnsupportedOperationException();
  }

  @Override
  public void payOnline() {
    //logic for paying online
  }

  @Override
  public void payInPerson() {
    //Not Applicable for Online Order
    throw new UnsupportedOperationException();
  }
}
