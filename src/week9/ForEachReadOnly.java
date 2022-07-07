package week9;

import java.util.Arrays;

public class ForEachReadOnly {

  public static void main(String[] args) {
    int[] intArray = new int[3];
    System.out.println(Arrays.toString(intArray));

    for (int element:intArray) {
      element = 5;
    }

    System.out.println(Arrays.toString(intArray));
  }
}
