package solid_examples.ex5;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BookDelivery {
  String title;
  Integer userID;

  public Location getDeliveryLocation(){
    return Location.builder().city("Huston").state("Texas").postCode("TX5564").build();
  }
}
