package interview_tasks.string_tasks;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/count-number-of-distinct-substring-in-a-string/
 *
 * This task is very similar to String_DisplayALlDistinctStrings task
 */
public class S55_String_CountPossibleDistinctStrings {
    /*
        Count of substrings having all distinct characters
        Given a string str consisting of lowercase alphabets, the task is to find the number of possible substrings
        (not necessarily distinct) that consists of distinct characters only.

        EXAMPLE:
        Input: Str = “gffg”
        Output: 6
        Explanation:
            All possible substrings from the given string are,
            ( “g“, “gf“, “gff”, “gffg”, “f“, “ff”, “ffg”, “f“, “fg“, “g” )
            Among them, the highlighted ones ( “g“, “gf“, “f“, “f“, “fg“, “g” ) consists of distinct characters only.

        EXAMPLE:
        Input: str = “gfg”
        Output: 5
        Explanation:
            All possible substrings from the given string are,
            ( “g“, “gf“, “gfg”, “f“, “fg“, “g” )
            Among them, the highlighted ( “g“, “gf“, “f“, “fg“, “g” ) consists of distinct characters only.
     */

    public static void main(String[] args) {
        defaultSolution1("gffg");
        defaultSolution1("gffg");
        defaultSolution1("abcd");
    }

    private static void defaultSolution1(String str){
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            for (int i = j; i < str.length(); i++) {
                String temp = str.substring(j, i + 1);
                boolean isDistinct = true;
                char[] ch = temp.toCharArray();
                Arrays.sort(ch);

                for (int k = 0; k < ch.length - 1; k++) {
                    if (ch[k] == ch[k + 1])
                        isDistinct = false;
                }

                if (isDistinct)
                    count++;
            }
        }

        System.out.println(count);
    }

    private static void defaultSolution2(String str){
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            for (int i = j; i < str.length(); i++) {
                String temp = str.substring(j, i + 1);
                long s = Arrays.stream(temp.split("")).distinct().count(); // new size excluding duplicates
                if (s == temp.length()) { // if the substring consists distinct characters
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
