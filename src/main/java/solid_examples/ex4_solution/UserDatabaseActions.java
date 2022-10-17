package solid_examples.ex4_solution;

import java.util.UUID;

public interface UserDatabaseActions {
  void saveUser(User user);
  void updateEmail(UUID userId, String email);
  boolean isEmailAlreadyRegistered(String email);
  User getUser(UUID userId);
}
