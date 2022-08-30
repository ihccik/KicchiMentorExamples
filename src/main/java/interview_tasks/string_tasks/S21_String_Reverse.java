package interview_tasks.string_tasks;

/**
 * https://www.geeksforgeeks.org/program-reverse-string-iterative-recursive/
 */
public class S21_String_Reverse {

    /*
        Write a function that can reverse String

        EXAMPLE:
        input: "ABCD"
        output: DCBA
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution("ABCD"));
    }

    public static String defaultSolution(String str) {
        String reverse="";

        for(int i=str.length()-1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }
        return reverse;
    }
}
