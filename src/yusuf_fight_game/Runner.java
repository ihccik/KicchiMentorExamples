package yusuf_fight_game;

import java.util.Arrays;

public class Runner {

  public static void main(String[] args) throws InterruptedException {
    Tournament.fighters.addAll(
        Arrays.asList(new Fighter("Muhammed Ali", 100, 20), new Fighter("Tyson", 100, 20),
            new Fighter("Yusuf", 100, 20), new Fighter("A", 100, 20), new Fighter("B", 100, 20)));

    Tournament.tournament();
  }
}
