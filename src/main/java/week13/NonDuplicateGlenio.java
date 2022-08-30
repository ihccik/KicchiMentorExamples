package week13;

import java.util.Scanner;

public class NonDuplicateGlenio {
  public static void main(String[] args) {
    //DO NOT TOUCH BELOW:
    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

    //WRITE YOUR CODE BELOW:

    int ret =0;
    for(int i = 0; i < nums.length; i++){
      int count = 0;
      for(int j=0; j<nums.length;j++){

        if(nums[i] == nums[j] && i!=j) {
          count++;
        }
      }
      if(count == 0){
        ret = nums[i];
        break;
      }
    }

    System.out.println(ret);

  }
}
