package yusuf_fight_game;

import static java.lang.Integer.valueOf;
import static yusuf_fight_game.Colors.color;

import java.util.Random;
import java.util.Scanner;

abstract class Game {

  private String name;
  private int strength, punchDamage;

  private static int length;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name.isBlank() || name.isEmpty()){
      System.err.println("name can not be empty");
      setName(new Scanner(System.in).nextLine());
    }else this.name = name;
  }

  public int getStrength() {
    return strength;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public int getPunchDamage() {
    return punchDamage;
  }

  public void setPunchDamage(int punchDamage) {
    this.punchDamage = punchDamage;
  }

  public static int getLength() {
    return length;
  }

  public static void setLength(int length) {
    Game.length = length;
  }

  public Game(String name, int strength, int punchDamage) {
    setName(name);
    setStrength(strength);
    setPunchDamage(punchDamage);
  }

  static void fight(Fighter fighter1, Fighter fighter2) throws InterruptedException {
    System.out.println("\n" +" ".repeat(("=".repeat(56).length() + (length*4))/2) + color(EColor.RED, " Box Starts in 3!"));
    Thread.sleep(1000);
    System.out.println(" ".repeat(("=".repeat(56).length() + (length*4))/2) + color(EColor.RED, " Box Starts in 2!"));
    Thread.sleep(1000);
    System.out.println(" ".repeat(("=".repeat(56).length() + (length*4))/2) + color(EColor.RED, " Box Starts in 1!"));
    Thread.sleep(1000);
    int textLength1 = "=".repeat(68).length() - " BOX STARTS ".length();
    System.out.println("\n" + color(EColor.LIGHT_GREEN_UNDERLINED, "*".repeat((textLength1 + (length*4))/2) +
        " BOX STARTS " + "*".repeat((textLength1 + (length*4))/2)));
    Thread.sleep(1000);
    do {
      if (new Random().nextBoolean()){
        int fighter1Damage = new Random().nextInt((fighter1.getPunchDamage()));
        if (fighter1Damage == 0){
          System.out.println(color(EColor.BLUE, fighter1.getName()) + color(EColor.LIGHT_GREEN, " tried to punch but missed!"));
        }else {
          fighter2.setStrength(fighter2.getStrength() - fighter1Damage);
          System.out.println(color(EColor.BLUE, fighter1.getName()) + color(EColor.BOLD, " punched! ") + color(EColor.LIGHT_YELLOW, "🤜"));
        }
      }else {
        int fighter2Damage = new Random().nextInt((fighter2.getPunchDamage()));
        if (fighter2Damage == 0){
          System.out.println(" ".repeat(41 + (length*4) - fighter2.getName().length()) + color(EColor.RED, fighter2.getName()) +
              color(EColor.LIGHT_GREEN, " tried to punch but missed!"));
        }else {
          fighter1.setStrength(fighter1.getStrength() - fighter2Damage);
          System.out.println(" ".repeat(56 + (length*4) - fighter2.getName().length()) +
              color(EColor.LIGHT_YELLOW, "🤛 ") + color(EColor.RED, fighter2.getName()) + color(EColor.BOLD, " punched!"));
        }
      }
      //fighter name
      System.out.println(color(EColor.BLUE, fighter1.getName()) + "\t".repeat(4 + length
          - (fighter1.getName().length()/4)) + " ".repeat(52).substring(0,  + " ".repeat(52).length() -
          (fighter2.getName().length())) + color(EColor.RED, fighter2.getName()));
      //fighter strength
      System.out.println(color(EColor.BLUE, "" + fighter1.getStrength()) + "\t".repeat(2 -
          String.valueOf(valueOf(fighter1.getStrength())).length()/4) + color(EColor.RED, " ".repeat(59 +
          (length*4)).substring(0, " ".repeat(59 + (length*4)).length()
          + 1 - String.valueOf(valueOf(fighter2.getStrength())).length()) + fighter2.getStrength()));
      //separator
      System.out.println(color(EColor.YELLOW, "=").repeat(68 + (length*4)));
      Thread.sleep(500);
    }while (fighter1.getStrength() > 0 && fighter2.getStrength() > 0);

    if (fighter1.getStrength() > 0){
      System.out.println(" ".repeat(("=".repeat(56).length() + (length*4) - fighter1.getName().length())/2) + color(EColor.LIGHT_GREEN_UNDERLINED, fighter1.getName() + " is the winner!"));
    }else System.out.println(" ".repeat(("=".repeat(56).length() + (length*4) - fighter2.getName().length())/2) + color(EColor.LIGHT_GREEN_UNDERLINED, fighter2.getName() + " is the winner!"));
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "{" +
        "name='" + name + '\'' +
        ", strength=" + strength +
        ", punchDamage=" + punchDamage +
        '}';
  }
}
