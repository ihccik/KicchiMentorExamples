package solid_examples.ex5_solution;

import java.util.List;

public class PosterMapDelivery extends OfflineDelivery{
  PosterMapDelivery(String title, int userId){
    super.title = title;
    super.userID = userId;
  }

  @Override
  public Location getDeliveryLocation(){
    return Location.builder().city("Birmingham").state("Alabama").postCode("AL8944").build();
  }
}
