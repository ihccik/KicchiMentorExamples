package week23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class LinkedListCycle {

  public static void main(String[] args) {
    //Expected solution: 2
    ListNode listNode = new ListNode(3);
    listNode.next = new ListNode(2);
    listNode.next.next = new ListNode(0);
    listNode.next.next.next = new ListNode(4);
    listNode.next.next.next.next = listNode.next;

    //non cycling linkedlist example
    /*ListNode listNode = new ListNode(3);
    listNode.next = new ListNode(3);
    listNode.next.next = new ListNode(3);
    System.out.println(detectCycleWithTwoPointer(listNode).val);*/

    //second node linked to the first node (head)
    /*ListNode listNode = new ListNode(1);
    listNode.next = new ListNode(2);
    listNode.next.next = listNode;*/

    System.out.println(detectCycleEkaterina(listNode).val);
    System.out.println(detectCycleWithTwoPointer(listNode).val);
    System.out.println(detectCycleWithHashSet(listNode).val);
    System.out.println(detectCycleWithArrayList(listNode).val);
  }

  public static ListNode detectCycleEkaterina(ListNode head) {
    ListNode slow=head;
    ListNode fast=head;
    boolean isCycle=false;

    while(fast!=null && fast.next!=null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) isCycle = true;break;// there is a cycle
    }
    if(isCycle){
      ListNode slow2 = head;

      if(slow2 == slow)
        return slow;
      else {
        slow2 = slow2.next;
        slow = slow.next;
      }
    }
    return null;
  }

  /*
  Best sol
   */
  static ListNode detectCycleWithTwoPointer(ListNode head){
    if (head == null || head.next == null) return null;

    ListNode slow = head, fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (fast == slow) {
        ListNode firstNode = head;
        ListNode intersection = fast;

        while (firstNode != intersection) {
          intersection = intersection.next;
          firstNode = firstNode.next;
        }

        return firstNode;
      }
    }

    return null;
  }

  static ListNode detectCycleWithHashSet(ListNode head) {
    ListNode node = head;
    HashSet<ListNode> set = new HashSet<>();
    while (node != null){
      if (!set.add(node)){
        return node;
      }
      node = node.next;
    }
    return null;
  }

  /*
  Worst sol
   */
  static ListNode detectCycleWithArrayList(ListNode head) {
    if (head == null || head.next == null)
      return null;

    ArrayList<ListNode> nodes = new ArrayList();
    ListNode currentNode = head;
    while (currentNode.next != null){
      nodes.add(currentNode);
      currentNode = currentNode.next;

      ListNode finalCurrentNode = currentNode;
      if (nodes.stream().anyMatch(listNode -> listNode == finalCurrentNode)){
        return finalCurrentNode;
      }
    }

    return null;
  }
}

 class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
 }
