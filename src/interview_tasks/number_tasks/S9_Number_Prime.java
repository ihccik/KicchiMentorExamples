package interview_tasks.number_tasks;

/**
 * https://www.geeksforgeeks.org/prime-numbers/
 */
public class S9_Number_Prime {

    /*
        Write a method that can check if a number is prime or not

        PRIME NUMBER: A prime number is a natural number greater than 1,
        which is only divisible by 1 and itself. First few prime numbers are : 2 3 5 7 11 13 17 19 23 …..
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution(7));
        System.out.println(kicchiSolution(7));
    }

    public static boolean defaultSolution(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static boolean kicchiSolution(int num){
        if (num <= 1)
            return false;

        int divider = 2;
        while (divider < num){
            if (num % divider++ == 0)
                return false;
        }
        return true;
    }
}
