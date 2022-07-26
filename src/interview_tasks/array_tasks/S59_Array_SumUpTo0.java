package interview_tasks.array_tasks;

import java.util.Arrays;

public class S59_Array_SumUpTo0 {

    /*
        Write a function:
        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
        The function can return any such array.

        EXAMPLE:
        input: 4
        output: [1,0, -3,2] or [-2,1, -4,5].
        explanation:
            The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).

        EXAMPLE:
        input: 3
        output: one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(defaultSolution(4)));
    }

    public static int[] defaultSolution(int N) {
        int[] result = new int[N];
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {
            result[i] = i;
            sum += i;
        }

        result[N - 1] = -sum;
        return result;
    }
}
