package solid_examples.ex5;

public class PosterMapDelivery extends BookDelivery {

  PosterMapDelivery(String title, int userId){
    super(title, userId);
  }

  @Override
  public Location getDeliveryLocation() {
    return Location.builder().city("Birmingham").state("Alabama").postCode("AL8944").build();
  }
}
