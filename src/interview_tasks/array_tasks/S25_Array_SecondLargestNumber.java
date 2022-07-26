package interview_tasks.array_tasks;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/find-second-largest-element-array/
 * https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array/
 * https://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/
 */
public class S25_Array_SecondLargestNumber {

    /*
        Given an array of integers, our task is to write a program that efficiently finds the second largest element present in the array.

        EXAMPLE:
        Input: arr[] = {12, 35, 1, 10, 34, 1}
        Output: The second largest element is 34.
        Explanation: The largest element of the
        array is 35 and the second
        largest element is 34
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution1(new int[]{9,19,10}));;
        System.out.println(defaultSolution2(new int[]{9,19,10}));;
    }

    public static int defaultSolution1(int[] arr){
        return Arrays.stream(arr).filter( p -> p != Arrays.stream(arr).max().getAsInt()).max().getAsInt();
    }

    public static int defaultSolution2(int[] arr){
        int max1 = arr[0];
        int max2 = arr[0];
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return max2;
    }
}
