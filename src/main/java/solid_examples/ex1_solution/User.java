package solid_examples.ex1_solution;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
  private String firstName;
  private String lastName;
  private String username;
  private String emailAddress;
}
