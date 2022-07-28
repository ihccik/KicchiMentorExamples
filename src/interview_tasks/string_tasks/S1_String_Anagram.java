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
        //System.out.println(defaultSolution1("abc", "cab"));;
        //System.out.println(defaultSolution2("abc", "cab"));;
        System.out.println(kicchiSolution("anagram", "nagaram"));;
    }

    //passed on leetcode
    public static boolean defaultSolution1(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

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

    //can not passed leetcode
    public static boolean defaultSolution2(String a, String b) {
        a = new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        b = new TreeSet<String>(Arrays.asList(b.split(""))).toString();
        return a.equals(b);
    }

    //passed on leetcode
    public static boolean kicchiSolution(String s, String t){
        if (s.length() != t.length())
            return false;

        int sIndex = 0;
        while (sIndex < s.length()){
            String currentSChar = "" + s.charAt(sIndex++);
            if (t.contains(currentSChar)){
                t = t.replaceFirst(currentSChar, "");
            }
            else {
                return false;
            }
        }
        return true;
    }
}
