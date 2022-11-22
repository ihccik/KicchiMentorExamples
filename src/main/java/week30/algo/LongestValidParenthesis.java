package week30.algo;

import java.util.Stack;

public class LongestValidParenthesis {

    public static void main(String[] args) {
        System.out.println(longestValidParenthesis(".().()()."));
        System.out.println(longestValidParenthesis("(()"));
        System.out.println(longestValidParenthesis(")()())"));
        System.out.println(longestValidParenthesis("(())...)"));
    }

    public static int longestValidParenthesis(String s){
        if(s == null)
            return 0;

        Stack<Integer> stack = new Stack();
        int result = 0;
        stack.push(-1);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && stack.size() > 1 && s.charAt(stack.peek()) == '(') {
                stack.pop();
                result = Math.max(result, i - stack.peek());
            } else {
                stack.push(i);
            }
        }

        return result;
    }
}


