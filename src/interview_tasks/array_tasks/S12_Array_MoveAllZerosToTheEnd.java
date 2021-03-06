package interview_tasks.array_tasks;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.geeksforgeeks.org/move-zeroes-end-array/
 * https://leetcode.com/problems/move-zeroes/
 */
public class S12_Array_MoveAllZerosToTheEnd {

    // write a program that can move all the zeros to the end of an array

    public static void main(String[] args) {
        System.out.println(Arrays.toString(defaultSolution(new int[]{4,4,0,5})));
        System.out.println(Arrays.toString(kicchiSolution(new int[]{4,4,0,5})));
    }

    public static int[] defaultSolution(int[] array) {
        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }

        return result;
    }

    public static int[] kicchiSolution(int[] array) {
        if (array == null || array.length == 1)
            return array;

        return Arrays.copyOf(IntStream.of(array).filter(i -> i != 0).toArray(), array.length);
    }
}
