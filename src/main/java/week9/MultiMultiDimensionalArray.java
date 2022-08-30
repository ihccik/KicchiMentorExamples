package week9;

import java.util.Arrays;

public class MultiMultiDimensionalArray {

  public static void main(String[] args) {
    String[][][][][][][][][][] array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}}; //10

    String rootValues = getRootArrayElements(array[0]);

    System.out.println(rootValues);
  }

  private static String getRootArrayElements(Object[] arr){
    if (arr.length == 1)
      return getRootArrayElements((Object[]) arr[0]);
    else
      return Arrays.toString((String[])arr);
  }
}
