package interview_tasks.array_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * these are merging two sorted arrays in order
 * https://leetcode.com/problems/merge-sorted-array/
 * https://www.geeksforgeeks.org/merge-two-sorted-arrays/
 */
public class S10_Array_MergeTwoArrays {

    // Write a return method that can concat two arrays

    public static void main(String[] args) {
        System.out.println(Arrays.toString(defaultSolution(new int[]{4,4,5}, new int[]{2,4,6})));
        System.out.println(Arrays.toString(kicchiSolution(new int[]{4,4,5}, new int[]{2,4,6})));
    }

    public static int[] defaultSolution(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;
    }

    public static int[] kicchiSolution(int[] arr1, int[] arr2){
        List<Integer> all = new ArrayList<>();
        Collections.addAll(all, (Arrays.stream(arr1).boxed().toArray(Integer[]::new)));
        Collections.addAll(all, (Arrays.stream(arr2).boxed().toArray(Integer[]::new)));
        return all.stream().mapToInt(Integer::intValue).toArray();
    }
}
