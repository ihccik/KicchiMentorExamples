package week9;

/**
 * Write a code that throws ArrayIndexOutOfBoundsException
 */
public class Exception_ArrayIndexOutOfBoundsException {

  public static void main(String[] args) {
    int[] myIntArr = new int[3];

    System.out.println(myIntArr[4]);
  }
}
