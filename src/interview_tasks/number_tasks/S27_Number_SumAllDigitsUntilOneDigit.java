package interview_tasks.number_tasks;

/**
 * https://leetcode.com/problems/add-digits/
 * https://www.geeksforgeeks.org/finding-sum-of-digits-of-a-number-until-sum-becomes-single-digit/
 */
public class S27_Number_SumAllDigitsUntilOneDigit {

    /*
        Sum all digits of a number until you reach one digit number

        EXAMPLE:
        input: 45659
        output:
                29
                11
                2
        Explanation:
                4+5+6+5+9=29
                2+9=11
                1+1=2
     */

    public static void main(String[] args) {
        defaultSolution(45659);
        defaultSolution(1234567);
    }

    private static void defaultSolution(int number){
        while (true) {
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                sum += digit;
            }
            number = sum;
            System.out.println(sum);
            if (sum < 9) {
                break;
            }
        }
    }
}
