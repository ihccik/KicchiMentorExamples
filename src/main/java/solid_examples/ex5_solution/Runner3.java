package solid_examples.ex5_solution;

public class Runner3 {

  public static void main(String[] args) {
    AudioBookDelivery audioBookDelivery = new AudioBookDelivery("Birds Audiobook", 43);
    deliverOnline(audioBookDelivery);
  }

  public static void deliverOnline(OnlineDelivery onlineDelivery){
    onlineDelivery.deliver();
  }
}
