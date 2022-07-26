package interview_tasks.array_tasks;

import java.util.Arrays;

public class S48_Array_SortInDescendingOrder {

    // Write a method that can sort an int array in descending order without using the sort method

    public static void main(String[] args) {
        System.out.println(Arrays.toString(defaultSolution(new int[]{5,4,6,3})));
    }

    public static int[] defaultSolution(int[] arr) {
        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] > result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }

        }
        return result;
    }
}
