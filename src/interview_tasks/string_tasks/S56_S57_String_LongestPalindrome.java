package interview_tasks.string_tasks;

import java.util.ArrayList;

/**
 * https://www.geeksforgeeks.org/longest-palindrome-substring-set-1/
 * https://www.geeksforgeeks.org/longest-palindromic-substring-set-2/?ref=rp
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
public class S56_S57_String_LongestPalindrome {
    /* Write a program that can return the longest palindrome from a string

        PALINDROME: A phrase is a palindrome if, after converting all uppercase letters into lowercase
        letters and removing all non-alphanumeric characters, it reads the same forward and backward.
        Alphanumeric characters include letters and numbers.

        EXAMPLE:
        Input: Given string :"forgeeksskeegfor",
        Output: "geeksskeeg"

        EXAMPLE:
        Input: Given string :"Geeks",
        Output: "ee"
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution1("Geeks"));
        System.out.println(defaultSolution2("Geeks"));
        System.out.println(defaultSolution3("Geeks"));

        System.out.println(defaultSolution1("forgeeksskeegfor"));
        System.out.println(defaultSolution2("forgeeksskeegfor"));
        System.out.println(defaultSolution3("forgeeksskeegfor"));
    }

    // Easier, but, involves using data structure
    public static String defaultSolution1(String str) {
        String longest = "";
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                list.add(str.substring(i, j));
            }
        }

        for (String each : list) {
            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }

            if (each.equalsIgnoreCase(reverse) && each.length() > longest.length()) {
                longest = each;
            }
        }
        return longest;
    }

    // Harder, but, does not need a data structure
    public static String defaultSolution2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i = i + 1) {
            int b = i;
            int e = i;
            while (b >= 0 && e <= str.length() - 1 && str.charAt(b) == str.charAt(e)) {
                b--;
                e++;
            }
            String temp = str.substring(b + 1, e);
            if (temp.length() > result.length()) result = temp;


            b = i; // for even length palindromes
            e = i + 1;
            while (b >= 0 && e <= str.length() - 1 && str.charAt(b) ==
                    str.charAt(e)) {
                b--;
                e++;
            }
            temp = str.substring(b + 1, e);
            if (temp.length() > result.length()) {
                result = temp;
            }
        }

        return result;
    }

    public static String defaultSolution3(String str) {
        String result = "";
        int max = 0;
        for (int i = 1; i < str.length(); i++) {
            int j = i, l = i;
            while (--j >= 0 && ++l <= str.length() - 1) {
                if (defaultSolution_isPalindrome(str.substring(j, l))) {
                    int length = str.substring(j, l).length();
                    if (length > max) {
                        max = length;
                        result = str.substring(j, l);
                    }
                }
            }
        }
        return (result.isEmpty()) ? "none" : result;
    }

    public static boolean defaultSolution_isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
