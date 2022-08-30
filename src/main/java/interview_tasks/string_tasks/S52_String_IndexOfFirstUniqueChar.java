package interview_tasks.string_tasks;

/**
 * This task is very similar to String_FirstUniqueCharacter
 */
public class S52_String_IndexOfFirstUniqueChar {

    /*
        Given a string, find the first non-repeating character in it and return its index.
        If it doesn't exist, return -1.

        EXAMPLE:
        input: "geerga"
        output: 3
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution("geerga"));
    }

    public static int defaultSolution(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (char each : s.toCharArray()) {
                if (each == s.charAt(i)) {
                    count++;
                }
            }
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }
}
