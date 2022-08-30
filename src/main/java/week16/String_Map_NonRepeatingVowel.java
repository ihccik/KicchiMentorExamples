package week16;

import java.util.LinkedHashMap;
import java.util.Map;

public class String_Map_NonRepeatingVowel {
  /*
    Given a string, write a method to find the first non-repeating vowel (a, e, i, o, u) in it and return its index.
    If it doesn't exist, return -1. Assume that all the characters of the String is lowercase.
    ( Do not use String class functions other than charAt() and length() )
 */
  public static void main(String[] args) {
    String word = "responsible";
    System.out.println(getFirstNonRepeatingVowel(word));
    System.out.println(getFirstNonRepeatingVowel1(word));
  }
  public static int getFirstNonRepeatingVowel1(String input) {
    Map<Character, Integer> map = new LinkedHashMap<>();
    for (int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);
      if ("aeiou".contains("" + currentChar)) {
        map.put(currentChar, map.getOrDefault(currentChar, 0)+1 );
      }
    }
    for (Map.Entry<Character, Integer> each : map.entrySet()) {
      if (each.getValue() == 1){
        return input.indexOf(each.getKey());
      }
    }
    return -1;
  }

  public static int getFirstNonRepeatingVowel(String input) {
    for (int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);
      if ("aeiou".contains("" + currentChar)) {
        int count = 0;
        for (int j = 0; j < input.length(); j++) {
          if (currentChar == input.charAt(j)) {
            count++;
          }
        }
        if (count == 1){
          return i;
        }
      }
    }
    return -1;
  }
}
