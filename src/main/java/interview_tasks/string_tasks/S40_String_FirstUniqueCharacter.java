package interview_tasks.string_tasks;

/**
 * https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 *
 * This task is very similar to String_IndexOfFirstUniqueChar
 */
public class S40_String_FirstUniqueCharacter {

    /*
        write a program that can return the first non-repeated character from a string

        EXAMPLE:
        Input: "geeksforgeeks"
        output: f
        Explanation:
            Step 1: Construct a character count array
                    from the input string.
               ....
              count['e'] = 4
              count['f'] = 1
              count['g'] = 2
              count['k'] = 2
              ……

            Step 2: Get the first character who's
                    count is 1 ('f').
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution("geeksforgeeks"));
    }

    public static char defaultSolution(String str) {
        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                return str.charAt(i);
            }
        }

        return ' ';
    }
}
