package solid_examples.ex4_solution;

import java.util.UUID;

public class UserService implements UserActions {

  UserDatabaseActions userDatabaseActions;
  EmailActions emailActions;

  @Override
  public void registerUser(User user) {
    if (UsernameUtility.isUsernameAppropriate(user.getUsername()) && EmailUtility.isEmailValid(
        user.getEmail()) && !userDatabaseActions.isEmailAlreadyRegistered(user.getEmail())){
      userDatabaseActions.saveUser(user);
      emailActions.sendEmail(EmailType.EMAIL_VALIDATION, user.getEmail());
    }
    else
      throw new RuntimeException("bla bla");
  }

  @Override
  public void changeEmail(UUID userId, String newEmail) {
    if (EmailUtility.isEmailValid(
        newEmail) && !userDatabaseActions.isEmailAlreadyRegistered(newEmail)){
      User userBeforeEmailUpdate = userDatabaseActions.getUser(userId);
      userDatabaseActions.updateEmail(userId, newEmail);
      emailActions.sendEmail(EmailType.SECURITY, userBeforeEmailUpdate.getEmail());
      emailActions.sendEmail(EmailType.EMAIL_VALIDATION, newEmail);
    }
  }
}
