package week9;

/**
 * Write a  function that check if a string is build out of
 * the same letters as another string. (Anagram Task)
 */
public class SameLetters {

  public static void main(String[] args) {
    System.out.println(hasSameLetters("heart","earth"));
    System.out.println(hasSameLetters("java","python"));
  }

  private static boolean hasSameLetters(String str1, String str2){
    if (str1 == null || str2 == null)
      return false;

    for (char ch:str1.toCharArray()) {
      if (!str2.contains("" + ch))
        return false;
    }
    return true;
  }
}
