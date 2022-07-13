package week13;

import java.util.Scanner;

public class NonDuplicateYusuf {

  public static void main(String[] args) {
    //DO NOT TOUCH BELOW:
    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

    //WRITE YOUR CODE BELOW:

    int count = 0;

    for (int each : nums) {
      int temporary = 0;
      for (int num : nums) {
        if (num == each) temporary++;
      }
      if (temporary < 2) {
        System.out.println(each);
        break;
      }
    }

  }
}
