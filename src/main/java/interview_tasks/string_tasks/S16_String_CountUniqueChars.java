package interview_tasks.string_tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.geeksforgeeks.org/count-the-number-of-unique-characters-in-a-given-string/
 */
public class S16_String_CountUniqueChars {
    /*
        Given a string as input, write Java code to count the number of unique characters in String.
        If there are no unique characters in the string, the method returns -1

        EXAMPLE:
        input: aaaabbbbbccccc
        output: -1

        EXAMPLE:
        input: aaaabbbbbccccck
        output: 1
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution1("aaaabbbbbccccc"));
        System.out.println(defaultSolution2("aaaabbbbbccccck"));

        System.out.println(kicchiSolution("aaaabbbbbccccc"));
        System.out.println(kicchiSolution("aaaabbbbbccccck"));
    }

    public static int defaultSolution1(String str) {
        int count = 0;

        for (int j = 0; j < str.length(); j++) {
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                count++;
            }
        }

        if (count == 0) {
            return -1;
        }
        return count;
    }

    public static int defaultSolution2(String str){
        int count = 0;
        for (String each : str.split("")) {
            int f = Collections.frequency(Arrays.asList(str.split("")) , each);
            if(f==1) {
                count++;
            }
        }
        return (count==0)? -1 : count;
    }


    public static int kicchiSolution(String str){
        int uniqueCharacterCount = 0;
        for (Character c: str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c))
                uniqueCharacterCount++;
        }
        return uniqueCharacterCount == 0 ? -1 : uniqueCharacterCount;
    }
}
