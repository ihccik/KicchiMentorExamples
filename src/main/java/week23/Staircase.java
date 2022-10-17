package week23;

import java.util.HashMap;

public class Staircase {

  public static void main(String[] args) {
    System.out.println(wayCountOf(1));
  }

  public static int wayCountOf(int n) {
    if (n == 1)
      return 1;
    if (n == 2)
      return 2;
    if (n == 3)
      return 4;

    return
             wayCountOf(n - 1) +
             wayCountOf(n - 2) +
             wayCountOf(n - 3);
  }

  static HashMap<Integer, Integer> stairWayPair = new HashMap<>();

  static {
    stairWayPair.put(1, 1);
    stairWayPair.put(2, 2);
    stairWayPair.put(3, 4);
  }

  public static int stepPerms(int n){
    if (n == 0)
      return 0;
    if (stairWayPair.containsKey(n))
      return stairWayPair.get(n);

    int wayCount = stepPerms(n - 1) + stepPerms(n - 2) + stepPerms(n - 3);
    stairWayPair.put(n, wayCount);
    return wayCount;
  }
}
