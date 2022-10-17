package solid_examples.ex5_solution;

public class Runner {

  public static void main(String[] args) {
    PosterMapDelivery posterMapDelivery = new PosterMapDelivery("Crime and Punishment", 465);
    deliver(posterMapDelivery);

    AudioBookDelivery audioBookDelivery = new AudioBookDelivery("Birds Audiobook", 43);
    deliver(audioBookDelivery);
  }

  public static void deliver(BookDelivery bookDelivery){
    bookDelivery.deliver();
  }


}
