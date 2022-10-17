package solid_examples.ex1;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
  private String firstName;
  private String lastName;
  private String username;
  private String emailAddress;

  public void sendEmail(Email email){
    if (email.isValid()){
      //send email
    }
    else
      throw new RuntimeException("Can not send email. Check email fields.");
  }
}
