package week25.algo;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists {

  public static void main(String[] args) {
    ListNode intersection = new ListNode(8);

    ListNode a = new ListNode(4);
    a.next = new ListNode(1);
    a.next.next = intersection;
    a.next.next.next = new ListNode(4);
    a.next.next.next.next = new ListNode(5);

    ListNode b = new ListNode(5);
    b.next = new ListNode(6);
    b.next.next = new ListNode(1);
    b.next.next.next = intersection;

    System.out.println(withSetTwoLoop(a, b).val);
  }

  public static ListNode withSetTwoLoop(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) return null;
    Set<ListNode> set = new HashSet<>();
    ListNode currentA = headA;
    ListNode currentB = headB;

    while (currentA != null) {
      set.add(currentA);
      currentA = currentA.next;
    }
    while (currentB != null) {
      if (set.contains(currentB)) return currentB;
      currentB = currentB.next;
    }

    return null;
  }

  static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }
}
