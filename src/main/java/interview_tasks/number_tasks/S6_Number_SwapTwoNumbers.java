package interview_tasks.number_tasks;

public class S6_Number_SwapTwoNumbers {

    // Swap two variable' values without using a third variable

    public static void main(String[] args) {
        defaultSolution1(23, 6);
        defaultSolution2(23, 6);
    }

    public static void defaultSolution1(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void defaultSolution2(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
