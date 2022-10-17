package solid_examples.ex4;

import lombok.Getter;

@Getter
public class User {
  private String username;
  private String email;

  public void registerNewUser(User user){
    //first, user fields should be checked if they meet the constraints of the company policy
    //second, email should be checked if it is a valid email address
    //third, this email should be checked if already registered to another user => needs database access
    //fourth, a new user record should be inserted to user table in the database => needs database access
    //fifth, a validation link should be sent to registered email address
  }

  public void changeEmail(String newEmail){
    //first, newEmail should be checked if it is a valid email address
    //second, this email should be checked if already registered to another user => needs database access
    //third, the email field of the user table in the database should be updated => needs database access
    //fourth, a security message should be sent to old email address to inform the user about the action taken
    //fifth, a validation link should be sent to newEmail address
    //sixth, a log record should be added to the logs that describes the action taken
  }
}
