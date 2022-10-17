package algo;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {

  public static void main(String[] args) {
    System.out.println(isValid("()"));//true
    System.out.println(isValid("()[]{}"));//true
    System.out.println(isValid("(]"));//false
    System.out.println(isValid("(])"));//false
  }

  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char currentChar = s.charAt(i);
      if (currentChar == '(' || currentChar == '[' || currentChar == '{'){
        stack.push(currentChar);
      }
      else {
        if (stack.isEmpty())
          return false;
        else{
          char lastCharFromStack = stack.peek();
          if ((lastCharFromStack == '(' && currentChar == ')') || (lastCharFromStack == '[' && currentChar == ']') || (lastCharFromStack == '{' && currentChar == '}')){
            stack.pop();
          }
          else
            return false;
        }
      }
    }

    return stack.isEmpty();
  }
}
