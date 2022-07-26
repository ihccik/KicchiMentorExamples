package interview_tasks.number_tasks;

/**
 * https://www.geeksforgeeks.org/program-for-armstrong-numbers/
 * https://leetcode.com/problems/armstrong-number/
 */
public class S42_Number_Armstrong {

    /*
        Write a method that can check if a number is Armstrong number
        Assume that, we are focusing only three digits numbers

        ARMSTRONG NUMBER:
        A positive integer of n digits is called an Armstrong number of order n (order is number of digits) if
        abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ….

        EXAMPLE:
        Input : 153
        Output : true
        Explanation:
            153 is an Armstrong number because
            (1 times 1) + (5 times 5) + (3 times 3) = 1 + 125 + 27 = 153
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution(1634));
    }

    public static boolean defaultSolution(int num) {
        int a = 0, b = 0, c = num;

        while (num > 0) {
            a = num % 10;
            num /= 10;
            b = b + (a * a * a);
        }

        return (c == b) ? true : false;
    }
}
