package interview_tasks.string_tasks;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.geeksforgeeks.org/count-number-of-distinct-substring-in-a-string/
 *
 * This task is very similar to String_CountPossibleDistinctStrings task
 */
public class S54_String_DisplayALlDistinctStrings {
    /*
        Given a string, display all distinct substrings of the given string.

        EXAMPLE:
        Input : abcd
        Output : abcd abc ab a bcd bc b cd c d

        EXAMPLE
        Input : aaa
        Output : aaa aa a aa a a
     */

    public static void main(String[] args) {
        defaultSolution("abcd");
    }

    private static void defaultSolution(String str){
        List<String> list = new ArrayList<>();

        for (int j = 0; j < str.length(); j++) {
            for (int i = str.length()-1; i>=j; i--) {
                list.add(str.substring(j, i+1 ));
            }
        }

        System.out.println(list);
    }
}
