package algo;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {

  public static void main(String[] args) {
    System.out.println(romanToInt("III"));//3
    System.out.println(romanToInt("LVIII"));//58
    System.out.println(romanToInt("MCMXCIV"));//1994
  }

  public static int romanToInt(String s) {
    Queue<Character> characters = new ArrayDeque<>(s.chars().mapToObj(c -> (char)c).collect(Collectors.toList()));
    int value = 0;
    while (!characters.isEmpty()){
      char currentChar = characters.poll();
      if (currentChar == 'I'){
        if (!characters.isEmpty() && characters.peek() == 'V'){
          value += 4;
          characters.poll();
        }
        else if (!characters.isEmpty() && characters.peek() == 'X'){
          value += 9;
          characters.poll();
        }
        else {
          value += 1;
        }
      }
      else if (currentChar == 'X'){
        if (!characters.isEmpty() && characters.peek() == 'L'){
          value += 40;
          characters.poll();
        }
        else if (!characters.isEmpty() && characters.peek() == 'C'){
          value += 90;
          characters.poll();
        }
        else {
          value += 10;
        }
      }
      else if (currentChar == 'C'){
        if (!characters.isEmpty() && characters.peek() == 'D'){
          value += 400;
          characters.poll();
        }
        else if (!characters.isEmpty() && characters.peek() == 'M'){
          value += 900;
          characters.poll();
        }
        else {
          value += 100;
        }
      }
      else if (currentChar == 'V'){
        value += 5;
      }
      else if (currentChar == 'L'){
        value += 50;
      }
      else if (currentChar == 'D'){
        value += 500;
      }
      else if (currentChar == 'M'){
        value += 1000;
      }
    }

    return value;
  }

  public boolean isPalindrome(int x) {
    if (x < 0 )
      return false;

    Stack<Integer> stack = new Stack<>();
    Queue<Integer> queue = new ArrayDeque<>();
    while (x > 0) {
      int digit = x % 10;
      stack.push(digit);
      queue.add(digit);
      x = x / 10;
    }

    while (!stack.isEmpty()){
      if (stack.pop() != queue.poll())
        return false;
    }
    return true;
  }

  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target)
          return new int[]{i, j};
      }
    }
    return null;
  }
}
