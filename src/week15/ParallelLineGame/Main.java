package week15.ParallelLineGame;

import java.util.Random;

public class Main {

  private static int lastSpaceCount = 0;
  private static int maxLineLength = 40;

  public static void main(String[] args) {

    while (lastSpaceCount < maxLineLength){
      printLine(new Random().nextInt(7));
    }
  }

  private static void printLine(int lineLength){
    System.out.println();
    System.out.print(" ".repeat(lastSpaceCount));
    lastSpaceCount += lineLength;
    System.out.print("-".repeat(lineLength));

  }
}
