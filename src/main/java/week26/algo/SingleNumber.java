package week26.algo;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

  public static void main(String[] args) {
    System.out.println(singleNumber3(new int[]{2,3,2}));
    System.out.println(singleNumber3(new int[]{2,3,2,4,3}));
  }

  public static int singleNumber(int[] nums) {
    Set<Integer> set = new HashSet<>();

    for (Integer num : nums) {
      if (set.contains(num)) {
        set.remove(num);
      } else {
        set.add(num);
      }
    }
    return set.stream().findFirst().get();
  }


  private static int singleNumber3(int[] nums) {

    int result = 0;
    for(int i : nums){
      result ^= i;
    }
    return result;

  }
}
