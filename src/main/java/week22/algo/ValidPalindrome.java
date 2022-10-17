package week22.algo;

import java.util.stream.Collectors;

public class ValidPalindrome {

  public static void main(String[] args) {
    System.out.println(twoPointerSol("Do geese see God?"));
    System.out.println(twoPointerSol("A man, a plan, a canal: Panama"));
  }

  // time complexity : O(n)
  // two pointer
  static boolean twoPointerSol(String str) {
    if (str == null || str.isBlank())
      return true;

    str = String.join("", str.chars()
                                    .filter(value -> Character.isLetterOrDigit((char) value))
                                    .mapToObj(operand -> String.valueOf((char)operand).toLowerCase())
                                    .collect(Collectors.toList()));

    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
      if (str.charAt(left) == str.charAt(right)) {
        left++;
        right--;
      } else
        return false;
    }
    return true;
  }
}
