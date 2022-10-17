package solid_examples.ex5_solution;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Location {
  private String state;
  private String city;
  private String postCode;
}
