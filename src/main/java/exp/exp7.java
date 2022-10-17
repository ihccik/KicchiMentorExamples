package exp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class exp7 {

  public static void main(String[] args) {

    int[][] input = new int[5][2];
    input[0] = new int[]{19,-15};
    input[1] = new int[]{4,9};
    input[2] = new int[]{13,-7};
    input[3] = new int[]{-3,-1};
    input[4] = new int[]{-10,30};
    System.out.println(Arrays.deepToString(input));

    System.out.println(solution(input));
  }

  static double solution(int[][] p) {
    double minDistance = Double.MAX_VALUE;

    for (int i = 0; i < p.length; i++) {

      for (int j = i + 1; j < p.length; j++) {
        double currentDistance = getDistance(p[i][0], p[j][0], p[i][1], p[j][1]);
        if (currentDistance < minDistance)
          minDistance = currentDistance;
      }
    }

    return minDistance;
  }

  static double getDistance(double x1, double x2, double y1, double y2){
    return Math.sqrt(Math.pow(Math.abs(y1 - y2), 2) + Math.pow(Math.abs(x1 - x2), 2));
  }


}
