package week16;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AltSolution_Easy_Map_FrequencyOfCharacters {
// Write a method that prints the frequency of each character from a String

  public static void main(String[] args) {

    System.out.println(defaultSolution(""));;
    System.out.println(altSolution("   "));;
  }

  static Map<Character, Integer> altSolution(String str){
    Map<Character, Integer> map = null;
    if (str == null)
      return map;

    map = new HashMap<>();

    for (char ch : str.toCharArray()) {
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    return map;
  }

  public static Map<Character, Integer> defaultSolution(String  str) {
    Map<Character, Integer> map = null;
    if (str == null)
      return map;

    map = new HashMap<>();

    for (Character each : str.toCharArray()) {
      if (map.containsKey(each)) {
        map.put(each, map.get(each) + 1);
      } else {
        map.put(each, 1);
      }
    }

    return map;
  }
}
