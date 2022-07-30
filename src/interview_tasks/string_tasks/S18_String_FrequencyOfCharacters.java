package interview_tasks.string_tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;


public class S18_String_FrequencyOfCharacters {

    /*
        Write function that can find the frequency of characters, and prints them in order of first occurrence of the character
        For this task, focus on the occurrences in whole input (not consecutive occurrences)

        EXAMPLE:
        input: "AAABBCDDA"
        output: A4B2C1D2
        explanation:
                A is repeated for 4 times in WHOLE input (3 consecutive and 1 separate),
                        and it is in the first order in string as a letter                  => A4
                B is repeated for 2 times in WHOLE input                                    => A4B2
                C is repeated for 1 time in WHOLE input                                     => A4B2C1
                D is repeated for 2 times in WHOLE input                                    => A4B2C1D2
                No need to check letter "A" at the end of the input, it is already checked for its first occurrence
     */

    public static void main(String[] args) {
        String input = "AAABBCDDA";
        System.out.println(defaultSolution1(input));
        System.out.println(defaultSolution2(input));
        System.out.println(defaultSolution4(input));
        System.out.println(kicchiSolution(input));
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

    public static String kicchiSolution(String str){
        Map<Character, Integer> occurrences = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            occurrences.put(c, occurrences.getOrDefault(c, 1));
        }
        System.out.println(occurrences);
        return null;
    }
}
