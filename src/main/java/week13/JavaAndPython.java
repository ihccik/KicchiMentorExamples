package week13;

import java.util.Scanner;

public class JavaAndPython {
  public static void main(String[] args) {
    //DO NOT TOUCH FOLLOWING LINE/LINES
    Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();

    //WRITE YOUR CODE BELOW
    int j = 0;
    int p = 0;

    for (int i = 0; i < sentence.length();) {
      String currentPart = sentence.substring(i);

      if (currentPart.startsWith("java")){
        j++;
        i += 4;
      }
      else if (currentPart.startsWith("python")){
        p ++;
        i += 6;
      }
      else
        i++;
    }

    System.out.println(j==p);
  }
}
