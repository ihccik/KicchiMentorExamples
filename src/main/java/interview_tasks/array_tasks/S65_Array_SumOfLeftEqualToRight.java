package interview_tasks.array_tasks;

/**
 * https://www.geeksforgeeks.org/find-element-array-sum-left-array-equal-sum-right-array/
 * https://leetcode.com/problems/find-pivot-index/
 */
public class S65_Array_SumOfLeftEqualToRight {

    /*
        Given an array of integers, write a function to return the item in the array,
        where the sum of all items on its left is equal to the sum of the ones on the right.

        EXAMPLE:
        input: [4, 9, 1, 3, 6, 4]
        output: 1
        explanation: 4+9 = 3+6+4
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution1(new int[]{4, 9, 1, 3, 6, 4}));
        defaultSolution2(new int[]{4, 9, 1, 3, 6, 4});
    }

    // solution 1: (If there is only one such an item)
    public static int defaultSolution1(int[] array) {
        int result = 0;

        for (int i = 1; i < array.length; i++) {
            int sumOfLeft = 0;
            int sumOfRight = 0;

            for (int j = 0; j < i; j++) {
                sumOfLeft += array[j];
            }

            for (int k = i + 1; k < array.length; k++) {
                sumOfRight += array[k];
            }

            if (sumOfLeft == sumOfRight) {
                result = array[i];
            }
        }
        return result;
    }

    // solution 2: (if there are more than one such items, and asking you to print all of them)
    public static void defaultSolution2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int sumOfLeft = 0;
            int sumOfRight = 0;

            for (int j = 0; j < i; j++) {
                sumOfLeft += array[j];
            }

            for (int k = i + 1; k < array.length; k++) {
                sumOfRight += array[k];
            }

            if (sumOfLeft == sumOfRight) {
                System.out.println(array[i]);
            }
        }
    }
}
