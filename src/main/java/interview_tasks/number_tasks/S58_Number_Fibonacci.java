package interview_tasks.number_tasks;

/**
 * https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
 */
public class S58_Number_Fibonacci {

    /*
        Given n as int, find the n th fibonacci number

        FIBONACCI:
        The Fibonacci sequence is a set of integers (the Fibonacci numbers) that starts with a zero,
        followed by a one, then by another one, and then by a series of steadily increasing numbers.
        The sequence follows the rule that each number is equal to the sum of the preceding two numbers.

        The Fibonacci numbers are the numbers in the following integer sequence.
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution(10));
    }

    public static int defaultSolution(int num) {
        int result = 0;
        int j = 0;
        int z = 1;

        for (int i = 1; i < num; i++) {
            result = j + z;
            j = z;
            z = result;
        }

        return result;
    }
}
