package week9.boxer;

import java.util.Random;

public class BoxMatch {

  public static void main(String[] args) throws InterruptedException {
    Boxer nathan = new Boxer("Nathan", 8);
    Boxer michael = new Boxer("Michael", 7);

    System.out.println("***********************\uD83E\uDD4A BOX STARTS \uD83E\uDD4A***********************");
    Thread.sleep(500);

    while (michael.strength > 0 && nathan.strength > 0){
      int whoseTurn = new Random().nextInt(2);

      if (whoseTurn == 1){
        System.out.println("Nathan punched! \uD83E\uDD1C");
        nathan.punch(michael);
      }
      else {
        System.out.println("                                               \uD83E\uDD1B Michael punched!");
        michael.punch(nathan);
      }

      writeBoxerNamesAndStrength(nathan, michael);
      writeSeparatorLine();
      Thread.sleep(600);
    }

    Boxer winner = nathan.strength > michael.strength ? nathan : michael.strength > nathan.strength ? michael : null;
    System.out.println("Winner is " + winner.name);
  }

  public static void writeBoxerNamesAndStrength(Boxer boxer1, Boxer boxer2){
    System.out.println("\u001B[34m" + boxer1.name + "                                                     \u001B[31m"+boxer2.name+"\u001B[0m");
    System.out.println("\u001B[34m" + boxer1.strength + "                                                              \u001B[31m" + boxer2.strength + "\u001B[0m");
  }

  public static void writeSeparatorLine(){
    System.out.println("\u001B[33m==================================================================\u001B[0m");
  }
}
