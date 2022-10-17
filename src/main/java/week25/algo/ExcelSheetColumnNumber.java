package week25.algo;

public class ExcelSheetColumnNumber {

  public static void main(String[] args) {
    System.out.println(forLoopStartingFromEnd("BCM"));
  }

  static int forLoopStartingFromEnd(String title) {
    int total = 0;
    int multiplier = 1;
    for (int i = title.length() - 1; i >= 0; i--) {
      total += (title.charAt(i) - 64) * multiplier;
      multiplier = multiplier * 26;
    }
    return total;
  }

  public static int withRecursion(String title) {
    if (title.length() == 0) return 0;
    return (title.charAt(title.length() - 1) - 64)
        + 26 * withRecursion(title.substring(0, title.length() - 1));
  }
}
