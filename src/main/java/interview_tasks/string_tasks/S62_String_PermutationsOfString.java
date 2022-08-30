package interview_tasks.string_tasks;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
 * https://www.geeksforgeeks.org/print-all-permutations-of-a-string-in-java/?ref=rp
 * https://www.geeksforgeeks.org/permutations-of-a-given-string-using-stl/
 *
 * very similar to Array_Permutation task
 */
public class S62_String_PermutationsOfString {

    /*
        Write a function that populates all different variations of a given String.

        PERMUTATION:
        A permutation, also called an “arrangement number” or “order”, is a rearrangement of the elements of an ordered list S
        into a one-to-one correspondence with S itself. A string of length n has n! permutation.

        EXAMPLE:
        Input: str = “cd”
        Output: cd dc

        EXAMPLE:
        Input: str = “abb”
        Output: abb abb bab bba bab bba
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution("ABC"));
    }

    private static List<String> defaultSolution(String str){
        List<String> partial = new ArrayList<>();
        partial.add(String.valueOf(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            for (int j = partial.size() - 1; j >= 0; j--) {
                String s = partial.remove(j);
                for (int k = 0; k <= s.length(); k++) {
                    partial.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
                }
            }
        }

        return partial;
    }
}
