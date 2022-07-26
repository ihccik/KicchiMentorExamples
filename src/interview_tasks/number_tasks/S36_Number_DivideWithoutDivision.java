package interview_tasks.number_tasks;

/**
 * https://www.geeksforgeeks.org/divide-two-integers-without-using-multiplication-division-mod-operator/
 */
public class S36_Number_DivideWithoutDivision {

    // Write a method that can divide two numbers without using division operator

    public static void main(String[] args) {
        defaultSolution(56, 3);
    }

    public static void defaultSolution(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Invalid Number");
            return;
        }

        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count + " and remainder is " + num1);
    }
}
