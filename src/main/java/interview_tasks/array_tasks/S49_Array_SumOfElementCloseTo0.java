package interview_tasks.array_tasks;

/**
 * https://www.geeksforgeeks.org/two-elements-whose-sum-is-closest-to-zero/
 *
 */
public class S49_Array_SumOfElementCloseTo0 {

    /*
        Find the sum of the two elements closest to zero

        If there are two elements equally close to zero like -2 and 2,
        consider the positive element to be "closer" to zero than the negative one.

        EXAMPLE:
        input {-8 -66 -60}
        Output: -68
        Explanation: Sum of two elements closest to
        zero is -68 using numbers -60 and -8.
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution(new int[]{-8 -66 -60}));
    }

    public static int defaultSolution(int[] a) {
        int b[] = new int[2];
        int z = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++) {
                int sum = a[i] + a[j];
                if (z == 0)
                    z = sum;
                if (Math.abs(sum) > 0 && Math.abs(sum) < Math.abs(z)) {
                    z = sum;
                    b[0] = a[i];
                    b[1] = a[j];
                }
            }
        return z;
    }
}
