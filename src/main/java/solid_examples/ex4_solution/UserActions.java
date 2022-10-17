package solid_examples.ex4_solution;

import java.util.UUID;

public interface UserActions {
  void registerUser(User user);
  void changeEmail(UUID userId, String newEmail);
}
