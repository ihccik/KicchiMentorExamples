package interview_tasks.string_tasks;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/
 * https://leetcode.com/problems/valid-anagram/
 */
public class S1_String_Anagram {

    /*
        Write a  function that check if a string is build out of the same letters as another string.

        ANAGRAM:
        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
        typically using all the original letters exactly once.

        EXAMPLE:
        inputs: "abc", "cab"
        output: true

        EXAMPLE:
        inputs: "abc", "abb"
        output: false
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution1("abc", "cab"));;
        System.out.println(defaultSolution2("abc", "cab"));;
    }

    public static boolean defaultSolution1(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 = "", a2 = "";

        for (char each : ch1) {
            a1 += each;
        }

        for (char each : ch2) {
            a2 += each;
        }

        return a1.equals(a2);
    }

    public static boolean defaultSolution2(String a, String b) {
        a = new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        b = new TreeSet<String>(Arrays.asList(b.split(""))).toString();
        return a.equals(b);
    }
}
