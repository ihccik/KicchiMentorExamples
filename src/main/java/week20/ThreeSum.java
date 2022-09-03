package week20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

  public static void main(String[] args) {
    int[] inputArray = new int[]{12, 3, 1, 2, -6, 5, -8, 6};
    int inputTargetSum = 0;

    twoPointerSolution(inputArray, inputTargetSum).stream().forEach(t -> System.out.println(Arrays.toString(t)));
    System.out.println("--------------");

    inputArray = new int[]{12, 3, 1, 2, -6, 5, -8};
    inputTargetSum = 0;
    twoPointerSolution(inputArray, inputTargetSum).stream().forEach(t -> System.out.println(Arrays.toString(t)));
    System.out.println("--------------");

    inputArray = new int[]{12, 3, 1, 2, -6, 5, -8};
    inputTargetSum = -1;
    twoPointerSolution(inputArray, inputTargetSum).stream().forEach(t -> System.out.println(Arrays.toString(t)));
    System.out.println("--------------");
  }

  public static List<Integer[]> twoPointerSolution(int[] array, int targetSum){
    Arrays.sort(array);// nlog n
    List<Integer[]> triplets = new ArrayList<Integer[]>();
    for (int i = 0; i < array.length - 2; i++) {
      int left = i + 1;
      int right = array.length - 1;
      while (left < right) {
        int currentSum = array[i] + array[left] + array[right];
        if (currentSum == targetSum) {
          Integer[] newTriplet = {array[i], array[left], array[right]};
          triplets.add(newTriplet);
          left++;
          right--;
        } else if (currentSum < targetSum) {
          left++;
        } else if (currentSum > targetSum) {
          right--;
        }
      }
    }
    return triplets;
  }
}
