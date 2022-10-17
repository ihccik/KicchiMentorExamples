package algo;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {

  public static void main(String[] args) {
    System.out.println(removeElement(new int[]{2,3,3}, 3));//1, [2]
    System.out.println(removeElement(new int[]{4,5}, 5));//1, [4]
    System.out.println(removeElement(new int[]{3,3}, 3));//0, []


    System.out.println(removeElement(new int[]{3,3}, 5));//2, [3,3]
    System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));//5, [0,1,4,0,3]
    System.out.println(removeElement(new int[]{3,2,2,3}, 3));//2, [2 2]

  }

  public static int removeElement(int[] nums, int val) {
    if (nums.length == 1){
      if (nums[0] == val)
        return 0;
      else
        return 1;
    }


    int indexToBeUpdated = -1;
    int length = 0;
    boolean anySwap = false;
    boolean occurrenceContinuing = false;

    for (int slow = 0; slow < nums.length; slow++) {
      if (nums[slow] == val){
        indexToBeUpdated = slow;

        for (int fast = slow + 1; fast < nums.length; fast++) {
          if (nums[fast] != val){
            nums[indexToBeUpdated] = nums[fast];
            nums[fast] = val;
            length = slow;
            anySwap = true;
            indexToBeUpdated = -1;
            occurrenceContinuing = false;
            break;
          }
          else {
            occurrenceContinuing = true;
          }
        }

        if (occurrenceContinuing){
          return indexToBeUpdated;
        }

      }

    }

    System.out.println(Arrays.toString(nums));
    if (anySwap){
      return length + 1;
    }
    else {
      if (indexToBeUpdated > -1){
        if (occurrenceContinuing)
          return 0;
        else
          return indexToBeUpdated;
      }
      else
        return nums.length;
    }
  }
}
