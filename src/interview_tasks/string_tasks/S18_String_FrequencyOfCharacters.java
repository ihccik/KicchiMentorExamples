package interview_tasks.string_tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

/**
 * https://www.geeksforgeeks.org/printing-frequency-of-each-character-just-after-its-consecutive-occurrences/
 * https://www.geeksforgeeks.org/print-characters-and-their-frequencies-in-order-of-occurrence-using-a-linkedhashmap-in-java/?ref=rp
 * https://www.geeksforgeeks.org/print-characters-and-their-frequencies-in-order-of-occurrence-using-binary-tree/?ref=rp
 *
 * This task is the same with String_CountOfRepeatedChars
 */
public class S18_String_FrequencyOfCharacters {

    /*
        Write function that can find the frequency of characters

        EXAMPLE:
        input: "AAABBCDD"
        output: A3B2C1D2
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution1("AAABBCDD"));
        System.out.println(defaultSolution2("AAABBCDD"));
        System.out.println(defaultSolution3("AAABBCDD"));
        System.out.println(defaultSolution4("AAABBCDD"));
    }

    public static String defaultSolution1(String str) {
        String expectedResult = "";
        int j = 0;
        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return expectedResult;
    }

    public static String defaultSolution2(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }
        }

        String expectedResult = "";
        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j)) {
                    count++;
                }
            }
            expectedResult += nonDup.charAt(j) + "" + count;
        }

        return expectedResult;
    }

    public static String defaultSolution3(String str) {
        String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        b = b.replace(", ", "").replace("[", "").replace("]", "");
        String result = "";
        for (int j = 0; j < b.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals("" + str.charAt(j))) {
                    count++;
                }
            }

            result += b.substring(j, j + 1) + count;
        }

        return result;
    }

    public static String defaultSolution4(String str) {
        String nonDup = "", result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }
        }
        for (int i = 0; i < nonDup.length(); i++) {
            int num = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));
            result += "" + nonDup.charAt(i) + num;
        }

        return result;
    }
}
