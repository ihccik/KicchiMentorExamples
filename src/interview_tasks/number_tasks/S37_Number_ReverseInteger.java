package interview_tasks.number_tasks;

/**
 * https://www.geeksforgeeks.org/reverse-digits-integer-overflow-handled/
 * https://leetcode.com/problems/reverse-integer/
 */
public class S37_Number_ReverseInteger {

    /*
        Reverse digits of an integer

        EXAMPLE:
        input: 38
        output: 83
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution(120));
    }

    public static int defaultSolution(int number){
        if(number < 10 && number >= 0)
            return number;

        int result = 0;
        while (number !=0) {
            result = result * 10 + number % 10;
            number /= 10;
        }

        return result;
    }
}
