package algo;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {

  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));//"fl"
    System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));//""
  }

  public static String longestCommonPrefix(String[] strs) {
    String[] variations = new String[strs[0].length()];
    for (int i = 0; i < variations.length; i++) {
      variations[i] = strs[0].substring(0, i + 1);
    }

    TreeMap<Integer, String> matches = new TreeMap<>();
    for (int i = 0; i < variations.length; i++) {
      int finalI = i;
      if (Arrays.stream(strs).allMatch(s -> s.startsWith(variations[finalI]))){
        matches.put(variations[finalI].length(), variations[finalI]);
      }
    }

    return matches.isEmpty() ? "" : matches.lastEntry().getValue();
  }
}
