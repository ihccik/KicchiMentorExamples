package week22.algo;

import java.util.Arrays;

public class MoveZerosToEndOfArray {
  public static void main(String[] args) {
    int[] arr = {0, 1, 0, 2, 0, 3, 7};

    moveZerosToEnd(arr);

    System.out.println(Arrays.toString(arr));
  }

  static void moveZerosToEnd(int[] arr) {
    int fast = 0, slow = 0;

    while (fast < arr.length-1) {
      if (arr[slow] != 0) {
        slow++;
      }
      if (fast <= slow || arr[fast] == 0) {
        fast++;
      }
      if (arr[slow] == 0 && arr[fast] != 0) {
        arr[slow] = arr[fast];
        arr[fast] = 0;
      }
    }
  }
}
