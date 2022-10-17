package week26.algo;

public class SingleNumber {

  public static void main(String[] args) {
    System.out.println(singleNumber3(new int[]{2,3,2}));
    System.out.println(singleNumber3(new int[]{2,3,2,4,3}));
  }

  private static int singleNumber3(int[] nums) {

    int result = 0;
    for(int i : nums){
      result ^= i;
    }
    return result;

  }
}
