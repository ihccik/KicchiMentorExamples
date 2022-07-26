package interview_tasks.array_tasks;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 * https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
 */
public class S52_Array_AddUpToSum {
    /*
         Given an int[] 'arr' and another int 'sum',
         Write a function which can find a pair of ints in 'arr' that add up to 'sum'.

        EXAMPLE:
            arr = [8, 7, 2, 5, 3, 1]
            sum = 10

            Output:
                {8=2, 7=3}
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution(new int[]{8, 7, 2, 5, 3, 1}, 10));
    }

    private static Map<Integer, Integer> defaultSolution(int[] arr, int sum){
        int num1 = 0;
        int num2 = 0;

        Map<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == sum){
                    pairs.put(arr[i], arr[j]);
                }
            }
        }

        return pairs;
    }
}
