package solid_examples.ex5;

public class Runner {

  public static void main(String[] args) {
    PosterMapDelivery posterMapDelivery = new PosterMapDelivery("Crime and Punishment", 465);
    deliverBook(posterMapDelivery);

    BookDelivery bookDeliveryOfPosterMap = (BookDelivery) posterMapDelivery;
    deliverBook(bookDeliveryOfPosterMap);

    AudioBookDelivery audioBookDelivery = new AudioBookDelivery("Birds", 32);
    deliverBook(audioBookDelivery);

    BookDelivery bookDeliveryOfAudioBook = (BookDelivery) audioBookDelivery;
    deliverBook(bookDeliveryOfAudioBook);
  }

  public static void deliverBook(BookDelivery bookDelivery){
    System.out.println(bookDelivery.title + " is delivered to " + bookDelivery.getDeliveryLocation().toString());
  }
}
