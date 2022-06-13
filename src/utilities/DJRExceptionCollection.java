package utilities;

import java.util.Scanner;

public class DJRExceptionCollection {

  /**
   * This code throws InputMismatchException
   */
  public static void eInputMismatchException(){
      Scanner scanner = new Scanner(System.in);

      int a = scanner.nextInt();//input a string to get InputMismatchException
    }

  /**
   * This code throws StringIndexOutOfBoundsException
   */
  public static void eStringIndexOutOfBoundsException(){
    String a = "asdasd";

    System.out.println(a.charAt(20));
  }

  /**
   * This code throws NumberFormatException
   */
  public static void eNumberFormatException(){
    String c = " ";
    int b = Integer.parseInt(c);
  }

  /**
   * This code throws DivideByZeroException
   */
  public static void eDivideByZeroException(){
    System.out.println(22/0);
  }

  /**
   * This code throws ArrayIndexOutOfBoundsException
   */
  public static void eArrayIndexOutOfBoundsException(){
    int[] myIntArr = new int[3];

    System.out.println(myIntArr[4]);//4 is not a valid index for myIntArr. Bec the last index is 2 for a 3 length array
  }

  /**
   * This code throws NegativeArraySizeException
   */
  public static void eNegativeArraySizeException(){
    int[] myIntArray = new int[2];
    System.out.println(myIntArray[-1]);//index of an Arrays always starts from 0, so negative index can not be applied!
  }

  /**
   * This code throws NullPointerException
   */
  public static void eNullPointerException(){
    String sentence = null;
    System.out.println(sentence.charAt(0));//Since sentence is a null object. We can not access anything of this null object
  }
}
