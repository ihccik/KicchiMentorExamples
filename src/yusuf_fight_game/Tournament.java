package yusuf_fight_game;

import static yusuf_fight_game.Colors.color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public interface Tournament {

  ArrayList<Fighter> fighters = new ArrayList<>();

  default void addFighter(Fighter fighter){
    fighters.add(fighter);
  }

  default void addFighter(Fighter[] fighters){
    this.fighters.addAll(Arrays.asList(fighters));
  }

  static void tournament() throws InterruptedException {
    int count = 1;
    do {
      if (fighters.size() == 2){
        System.out.println("\n" + " ".repeat(28) + color(EColor.LIGHT_WHITE, "Final match"));
        Thread.sleep(1000);
      } else if (fighters.size() == 3 || fighters.size() == 4) {
        System.out.println("\n" + " ".repeat(28) + color(EColor.LIGHT_WHITE, "Semi-Final"));
        Thread.sleep(1000);
      }else {
        System.out.println("\n" + " ".repeat(28) + color(EColor.LIGHT_WHITE, count + ". Match"));
        Thread.sleep(1000);
      }

      Fighter firstFighter = fighters.get(new Random().nextInt(fighters.size()));

      int firstFighterStrength = firstFighter.getStrength();

      Fighter secondFighter;

      do {
        secondFighter = fighters.get(new Random().nextInt(fighters.size()));
      } while (firstFighter == secondFighter);

      int secondFighterStrength = secondFighter.getStrength();

      Game.fight(firstFighter, secondFighter);

      if (firstFighter.getStrength() > 0){
        secondFighter.setDidLose(true);
        firstFighter.setStrength(firstFighterStrength);
      }else {
        firstFighter.setDidLose(true);
        secondFighter.setStrength(secondFighterStrength);
      }

      fighters.removeIf(p -> p.getDidLose());

      count++;

    }while (fighters.size() != 1);

    Fighter winner = fighters.get(0);

    String spaces = " ".repeat(21 - winner.getName().length() + Game.getLength() * 4);

    String celebration = spaces + color(EColor.LIGHT_YELLOW, "*") + color(EColor.LIGHT_PURPLE, winner.getName() + " is the champion of the tournament");

    String repeat = "*".repeat(celebration.length() - spaces.length() - 19);

    System.out.println("\n" + spaces + color(EColor.LIGHT_YELLOW, repeat));

    System.out.println(celebration + color(EColor.LIGHT_YELLOW, "*"));

    System.out.println(spaces + color(EColor.LIGHT_YELLOW, repeat));

    System.out.println("\n" + spaces + color(EColor.LIGHT_WHITE, winner.toString()));
  }
}
