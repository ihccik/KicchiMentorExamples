package week25.algo;

import java.util.Map;

public class RomanToInteger {

  public static void main(String[] args) {
    System.out.println(withMap("LIV"));//54
    System.out.println(withMap("III"));//3
    System.out.println(withMap("LVIII"));//58
    System.out.println(withMap("MCMXCIV"));//1994
  }

  static int withMap(String s) {
    if (s == null || s.isBlank()) return -1;
    Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    int prev = 0;
    int total =0;

    for (int i = s.length()-1; i >= 0; i--) {
      int current = map.get(s.charAt(i));
      if (current >= prev){
        total = total + current;
      } else {
        total = total - current;
      }
      prev = current;
    }
    return total;
  }
}
