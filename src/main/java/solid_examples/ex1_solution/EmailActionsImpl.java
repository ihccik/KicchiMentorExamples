package solid_examples.ex1_solution;

public class EmailActionsImpl implements EmailActions{

  @Override
  public void sendEmail(Email email) {
    if (email.isValid()){
      //send email
    }
    else
      throw new RuntimeException("Can not send email. Check email fields.");
  }
}
