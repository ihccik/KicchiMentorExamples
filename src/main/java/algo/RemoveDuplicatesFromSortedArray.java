package algo;

import java.util.Arrays;

/**
 *https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray {

  public static void main(String[] args) {
    System.out.println(removeDuplicates(new int[]{1,1,2,3}));//3 [1,2,3]
    //System.out.println(removeDuplicates(new int[]{1,1}));//1 [1,1]
    System.out.println(removeDuplicates(new int[]{1,2,2}));//2 [1,2,2]
    System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));//5 [0,1,2,3,4]
    System.out.println(removeDuplicates(new int[]{1,2,2,2}));//2 [1,2]



    System.out.println(removeDuplicates(new int[]{1,2}));//2 [1,2]
    System.out.println(removeDuplicates(new int[]{1,1,2}));//2 [1,2]

  }

  public static int removeDuplicates(int[] nums) {
    if (nums.length == 1 || nums[0] == nums[nums.length - 1])
      return 1;

    int indexToBeUpdated = -1;
    boolean matchContinues = false;
    for (int i = 0, j =1 ; i < nums.length && j < nums.length; i++, j++) {
      if (nums[i] == nums[j]){//slow == fast
        if (indexToBeUpdated == -1){
          indexToBeUpdated = j;
        }
        else if (!matchContinues && nums[indexToBeUpdated] == nums[i]){
          matchContinues = true;
          indexToBeUpdated = i;
        }
      }
      else if (indexToBeUpdated > -1){
          nums[indexToBeUpdated] = nums[j];
          indexToBeUpdated++;
      }
    }

    System.out.println(Arrays.toString(nums));
    return indexToBeUpdated == -1 ? nums.length : indexToBeUpdated;
  }

  /*public static int removeDuplicates(int[] nums) {
    if (nums.length == 1)
      return 1;
    if (nums[0] == nums[nums.length - 1])
      return 1;

    int firstDuplicateIndex = 0;
    int changeCounter = 0;
    int lastMovedValue = 0;
    boolean anyMatch = false;
    boolean anyMove = false;
    for (int i = 0, j =1 ; i < nums.length && j < nums.length; i++, j++) {
      if (nums[i] == nums[j]){
        if (firstDuplicateIndex == 0){
          firstDuplicateIndex = j;
          anyMatch = true;
          anyMove = false;
        }else
          anyMatch = false;
      }
      else {
        if (firstDuplicateIndex != 0 && nums[j] > lastMovedValue){
          anyMove = true;
          anyMatch = false;
          lastMovedValue = nums[j];
          nums[firstDuplicateIndex] = nums[j];
          firstDuplicateIndex++;
          changeCounter++;
          i--;
          j--;
        }
      }
    }

    if (anyMatch && !anyMove){
      anyMove = true;
      changeCounter++;
    }

    System.out.println(Arrays.toString(nums));
    return anyMove ? changeCounter + 1 : nums.length;
  }*/
}
