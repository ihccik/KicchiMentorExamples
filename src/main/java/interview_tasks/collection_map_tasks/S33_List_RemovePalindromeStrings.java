package interview_tasks.collection_map_tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * https://www.geeksforgeeks.org/remove-palindromic-words-given-sentence/
 *
 */
public class S33_List_RemovePalindromeStrings {

   /*
        remove palindrome strings from a List of String

        PALINDROME: A phrase is a palindrome if, after converting all uppercase letters into lowercase
        letters and removing all non-alphanumeric characters, it reads the same forward and backward.
        Alphanumeric characters include letters and numbers.
    */

    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("madam"); input.add("adam"); input.add("murtaza"); input.add("aza");

        System.out.println(defaultSolution1(input));
    }

    public static List<String> defaultSolution1(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String word = it.next();
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            if (word.equalsIgnoreCase(reversed)) {
                it.remove();
            }
        }
        return list;
    }

    public static List<String> defaultSolution2(List<String> list) {
        list.removeIf(p -> defaultSolution_isPalindrome(p));
        return list;
    }

    public static boolean defaultSolution_isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed.equalsIgnoreCase(str);
    }
}
