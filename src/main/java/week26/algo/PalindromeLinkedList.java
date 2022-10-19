package week26.algo;

import java.util.Stack;

public class PalindromeLinkedList {

  public static void main(String[] args) {
    ListNode headOdd = new ListNode(1);
    headOdd.next = new ListNode(8);
    headOdd.next.next = new ListNode(3);
    headOdd.next.next.next = new ListNode(6);
    headOdd.next.next.next.next = new ListNode(3);
    headOdd.next.next.next.next.next = new ListNode(8);
    headOdd.next.next.next.next.next.next = new ListNode(1);
    System.out.println(isPalindrome(headOdd));//expected true

    ListNode headEven = new ListNode(1);
    headEven.next = new ListNode(8);
    headEven.next.next = new ListNode(3);
    headEven.next.next.next = new ListNode(3);
    headEven.next.next.next.next = new ListNode(8);
    headEven.next.next.next.next.next = new ListNode(1);
    System.out.println(isPalindrome(headEven));//expected true

    ListNode head = new ListNode(1);
    head.next = new ListNode(8);
    head.next.next = new ListNode(3);
    System.out.println(isPalindrome(head));//expected false
  }

  public static boolean isPalindrome(ListNode head) {
    ListNode current = head;
    Stack<Integer> stack = new Stack<Integer>();

    while (current != null) {
      stack.push(current.value);
      current = current.next;
    }

    while (head != null) {
      if (head.value != stack.pop()) {
        return false;
      }

      head = head.next;
    }
    return true;
  }

  static class ListNode {
    int value;
    ListNode next;

    ListNode(int x) {
      value = x;
      next = null;
    }
  }
}
