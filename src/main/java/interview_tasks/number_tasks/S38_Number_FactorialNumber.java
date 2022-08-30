package interview_tasks.number_tasks;

/**
 * https://www.geeksforgeeks.org/program-for-factorial-of-a-number/
 */
public class S38_Number_FactorialNumber {

    /*
        Write a return method that returns the factorial number of any given number

        FACTORIAL:
        Factorial of a non-negative integer, is multiplication of all positive integers
        smaller than or equal to n. For example factorial of 6 is 6*5*4*3*2*1 which is 720.

        EXAMPLE:
        Input: 5
        Output: 120
        Explanation: 5 * 4 * 3 * 2 * 1 = 120
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution(5));
    }

    public static int defaultSolution(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }
}
