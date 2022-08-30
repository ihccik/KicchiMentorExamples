package week9;

/**
 * Write a program that can remove all the extra space from string
 */
public class ExtraSpace {

  public static void main(String[] args) {
    System.out.println(removeExtraSpace("  Hello world      I      love      Java    "));
  }

  private static String removeExtraSpace(String inputStr){
    while (inputStr.contains("  ")){
      inputStr = inputStr.replace("  "," ");
    }
    return inputStr.trim();
  }
}
