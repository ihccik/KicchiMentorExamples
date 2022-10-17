package week24.algo;

import java.util.Stack;

public class ElementsGreaterThanRight {

  public static void main(String[] args) {
    int[] arr = { 5, 4, 6, 3, 2, 10 };
    find(arr);
  }

  // Function to print all elements which are greater than all elements present to their right
  public static void find(int[] arr) {

    if (arr == null || arr.length == 0) return; // base case

    Stack<Integer> stack = new Stack<>(); // create an empty stack

    for (int value: arr) {
      // pop all the elements that are less than the current element
      while (!stack.isEmpty() && stack.peek() < value) {
        stack.pop();
      }
      stack.push(value); // push current element into the stack
    }

    while (!stack.isEmpty()) { // print all elements in the stack
      System.out.print(stack.pop() + " ");
    }
  }
}
