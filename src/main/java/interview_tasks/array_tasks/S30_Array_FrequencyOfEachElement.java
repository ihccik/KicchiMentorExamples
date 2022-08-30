package interview_tasks.array_tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/**
 * https://www.geeksforgeeks.org/frequency-of-a-string-in-an-array-of-strings/
 */
public class S30_Array_FrequencyOfEachElement {

    /*
        You are given a collection of strings and a list of queries.
        For every query there is a string given.
        We need to print the number of times the given string occurs in the collection of strings.

        EXAMPLE:
        input: {"Apple","Banana","Apple","Cherry"}
        Output:
        Apple = 2
        Banana = 1
        Cherry = 1
     */

    public static void main(String[] args) {
      defaultSolution1(new String[]{"Apple","Banana","Apple","Cherry"});
      defaultSolution2(new String[]{"Apple","Banana","Apple","Cherry"});
      defaultSolution3(new String[]{"Apple","Banana","Apple","Cherry"});
    }

    private static void defaultSolution1(String[] testArray){
      Map<String, Integer> map = new LinkedHashMap<>();

      for (String each : testArray) {
        int frequency = 0;
        for (String s : testArray) {
          if(each.equals(s)){
            frequency++;
          }
        }
        map.put(each, frequency);
      }

      for (Map.Entry<String, Integer> entry : map.entrySet()) {
        System.out.println(entry);
      }
    }

    private static void defaultSolution2(String[] testArray){
      List<String> temp = Arrays.asList(testArray);
      for (String s : new LinkedHashSet<>(temp)) {
        System.out.println(s +"="+ Collections.frequency(temp, s) );
      }
    }

    private static void defaultSolution3(String[] testArray){
      Arrays.stream(testArray).distinct().forEach( e ->
          System.out.println(e+"="+Arrays.stream(testArray).filter( p -> p.equals(e)).count() ));
    }
}
