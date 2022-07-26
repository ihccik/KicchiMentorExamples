package interview_tasks.number_tasks;

/**
 * https://www.geeksforgeeks.org/happy-number/?ref=gcse
 * https://leetcode.com/problems/happy-number/
 */
public class S67_Number_HappyAndUnhappyNumber {

    /*
        Write a function that can identify if a number is a happy Number or unhappy number

        HAPPY NUMBER:
        A number is called happy if it leads to 1 after a sequence of steps wherein
        each step number is replaced by the sum of squares of its digit that is
        if we start with Happy Number and keep replacing it with digits square sum, we reach 1.

        EXAMPLE:
        Input: n = 19
        Output: True
        Explanation:
            19 is Happy Number,
            1^2 + 9^2 = 82
            8^2 + 2^2 = 68
            6^2 + 8^2 = 100
            1^2 + 0^2 + 0^2 = 1
            As we reached to 1, 19 is a Happy Number.

        EXAMPLE:
        Input: n = 20
        Output: False
     */

    public static void main(String[] args) {
        defaultSolution(19);
    }

    public static void defaultSolution(int n){
        while(n != 1 && n != 4){
            int r = 0, sum = 0;

            while(n > 0){
                r = n%10;
                sum = sum + (r*r);
                n = n/10;
            }

            n = sum;
        }

        if(n==1){
            System.out.println("Happy number");
        }else{
            System.out.println("Unhappy number");
        }
    }
}
