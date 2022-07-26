package interview_tasks.array_tasks;

public class S23_Array_FindMaximum {
    // Write a function that can find the maximum number from an int Array

    public static void main(String[] args) {
        System.out.println(defaultSolution(new int[]{8, 7, 2, 5, 3, 1}));
    }

    public static int defaultSolution(int[] n) {

        int max = Integer.MIN_VALUE;

        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }
}
