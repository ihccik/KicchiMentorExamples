package solid_examples.ex1;

import java.io.File;
import java.util.List;

public class Email {
  private String subject;
  private String body;
  private List<File> attachments;
  private User fromUser;
  private User toUser;

  public boolean hasAttachment(){
    return attachments != null && !attachments.isEmpty();
  }

  public boolean isValid(){
    return !body.isEmpty() && fromUser != null && toUser != null;
  }

  public User createNewUser(String firstName, String lastName, String username, String emailAddress){
    return User.builder().firstName(firstName).lastName(lastName).username(username).emailAddress(emailAddress).build();
  }
}
