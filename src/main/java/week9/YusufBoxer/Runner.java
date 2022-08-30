package week9.YusufBoxer;

public class Runner {

  public static void main(String[] args) throws InterruptedException {
    Fighter nathan = new Fighter("Nathan", 100, 9);
    Fighter michael = new Fighter("Michael", 100, 12);

    Fighter.setLength(20);
    Fighter.fight(nathan, michael);
  }
}
