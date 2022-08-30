package week9;

/**
 * write a code that throws NegativeArraySizeException
 */
public class Exception_NegativeArraySizeException {

  public static void main(String[] args) {
    int[] myIntArray = new int[2];
    System.out.println(myIntArray[-1]);
  }
}
