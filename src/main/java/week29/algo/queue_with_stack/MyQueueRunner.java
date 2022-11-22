package week29.algo.queue_with_stack;


import java.util.LinkedList;
import java.util.List;

public class MyQueueRunner {
  public static void main(String[] args) {
    MyQueue q = new MyQueue();
    q.enqueue(1);
    q.enqueue(2);
    System.out.println(q.peek());    // should print 1
    System.out.println(q.dequeue()); // should print 1
    q.enqueue(3);
    System.out.println(q.isEmpty()); // should print false
    System.out.println(q.dequeue()); // should print 2
    System.out.println(q.dequeue()); // should print 3
    System.out.println(q.isEmpty()); // should print true
  }
}
