package solid_examples.ex1_solution;

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
}
