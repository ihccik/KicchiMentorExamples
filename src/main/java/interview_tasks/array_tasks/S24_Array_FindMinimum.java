package interview_tasks.array_tasks;

import java.util.Arrays;
import java.util.stream.IntStream;

public class S24_Array_FindMinimum {

    // Write a function that can find the maximum number from an int Array

    public static void main(String[] args) {
        System.out.println(defaultSolution(new int[]{8, 7, 2, 5, 3, 1}));
        System.out.println(kicchiSolution(new int[]{8, 7, 2, 5, 3, 1}));
    }

    public static int defaultSolution(int[] n) {
        int min = Integer.MAX_VALUE;

        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

    public static int kicchiSolution(int[] n){
        return IntStream.of(n).min().getAsInt();
    }
}