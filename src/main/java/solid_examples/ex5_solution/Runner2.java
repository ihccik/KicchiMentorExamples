package solid_examples.ex5_solution;

public class Runner2 {

  public static void main(String[] args) {
    PosterMapDelivery posterMapDelivery = new PosterMapDelivery("Crime and Punishment", 465);
    deliverOffline(posterMapDelivery);
  }

  public static void deliverOffline(OfflineDelivery offlineDelivery){
    offlineDelivery.deliver();
  }
}
