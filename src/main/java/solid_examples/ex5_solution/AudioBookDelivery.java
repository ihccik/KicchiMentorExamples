package solid_examples.ex5_solution;

public class AudioBookDelivery extends OnlineDelivery{

  AudioBookDelivery(String title, int userId){
    super.title = title;
    super.userID = userId;
  }

  @Override
  public String getEmail() {
    return "cy@deo.com";
  }
}
