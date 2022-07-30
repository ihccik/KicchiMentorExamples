package week16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AltSolution_Easy_Map_TimeSeries {
  /*
        A time series is represented as a list of time/value pairs. Write a function whose input is two time series
        and whose output is a new time series of the summation of them.

        EXAMPLE:
        Input:
            series A: [(1, 1.0), (2, 1.5), (3, 2.0)]
            series B: [(2, 1.0), (3, 2.5), (5, 1.0)]

        output:
            Assuming we have '0' for a time pair that's missing, this is the result:
            [(1, 1.0), (2, 2.5), (3, 4.5), (5, 1.0)]

        explanation:
            from input1 => (1, 1.0)    (2, 1.5)    (3, 2.0)
            from input2 =>             (2, 1.0)    (3, 2.5)     (5, 1.0)
            summation   => (1, 1.0)    (2, 2.5)    (3, 4.5)     (5, 1.0)
     */

  public static void main(String[] args) {
    Map<Integer, Double> a = Map.of(1, 1.0, 2, 1.5, 3, 2.0);
    Map<Integer, Double> b = Map.of(2, 1.0, 3, 2.5, 5, 1.0);
    System.out.println(defaultSolution(a, b));
    //System.out.println(altSolution(a, b));
    //System.out.println(altSolution2(a, b));
  }

  public static Map<Integer, Double> altSolution(Map<Integer, Double> map1, Map<Integer, Double> map2) {
    Map<Integer, Double> result = new HashMap<>(map1);
    for (Map.Entry<Integer, Double> entry : map2.entrySet()) {
      result.put(entry.getKey(), result.getOrDefault(entry.getKey(), 0D) + entry.getValue());
    }
    return result;
  }

  public static Map<Integer, Double> altSolution2(Map<Integer, Double> map1, Map<Integer, Double> map2) {
    Map<Integer, Double> result = new HashMap<>(map1);
    map2.forEach((k, v) -> result.put(k, result.getOrDefault(k, 0D) + v));
    return result;
  }

  public static Map<Integer, Double> defaultSolution(Map<Integer, Double> map1, Map<Integer, Double> map2) {
    Map<Integer, Double> result = new HashMap<>();
    result.putAll(map1);
    Set<Integer> keys = new HashSet<>();
    keys.addAll(map1.keySet());
    keys.addAll(map2.keySet());


    while (keys.size() != result.keySet().size()) {
      for (Integer eachMap2Key : map2.keySet()) {
        if (result.keySet().contains(eachMap2Key)) {
          result.put(eachMap2Key, result.get(eachMap2Key) + map2.get(eachMap2Key));
        } else {
          result.put(eachMap2Key, map2.get(eachMap2Key));
        }
      }
    }
    return result;
  }
}
