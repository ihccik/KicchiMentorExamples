package interview_tasks.array_tasks;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * very similar to String_PermutationsOfString task
 */
public class S46_Array_Permutation {

   /*
        Given an array of 3 characters print all permutation combinations from the given characters

        EXAMPLE:
        input: {'r','5','h'}
        output:
        [r, 5, h]
        [r, h, 5]
        [5, r, h]
        [5, h, r]
        [h, r, 5]
        [h, 5, r]
    */

    public static void main(String[] args) {
        defaultSolution(new char[]{'r','5','h'});
    }

    public static void defaultSolution(char[] ch) {
        for (String s : defaultSolution_permutation(ch)) {
            System.out.println(Arrays.toString(s.toCharArray()));
        }
    }

    public static Set<String> defaultSolution_permutation(char[] ch) {
        String str = Arrays.toString(ch).replace(", ", "").replace("[", "").replace("]", "");
        Set<String> set = new LinkedHashSet<>();

        if (str.length() == 1) {
            set.add(str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String a3 = str.substring(0, i) + str.substring(i + 1);
                char[] ch2 = a3.toCharArray();
                for (String permutation : defaultSolution_permutation(ch2)) {
                    set.add(str.charAt(i) + permutation);
                }
            }

        }

        return set;
    }

}
