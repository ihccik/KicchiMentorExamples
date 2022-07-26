package interview_tasks.number_tasks;

public class S26_Number_SumOfDigitsOfInteger {

    /*
        write a function that can return the sum of digits of an integer
        Do not use any string manipulations

        EXAMPLE:
            input: 123
            output: 6
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution(123));
    }

    public static int defaultSolution(int number) {
        int sum = 0;

        while (number > 0) {
            sum += (number % 10);
            number /= 10;
        }

        return sum;
    }
}
