package week16.dsShorts;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Main {

  public static void main(String[] args) {
    Integer[] arr = new Integer[]{3,2,3,2,1};
    System.out.println("arr = " + Arrays.toString(arr));

    ArrayList<Integer> list = new ArrayList(List.of(arr));
    System.out.println("list = " + list);

    LinkedList<Integer> linkedList = new LinkedList(list);
    System.out.println("linkedList = " + linkedList);

    Vector<Integer> vector = new Vector(linkedList);
    System.out.println("vector = " + vector);

    Stack<Integer> stack = new Stack();
    stack.addAll(vector);
    System.out.println("stack = " + stack);

    PriorityQueue<Integer> priorityQueue = new PriorityQueue(list);
    System.out.println("priorityQueue = " + priorityQueue);

    //ArrayDeque maintains insertion order
    ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(list);
    System.out.println("arrayDeque = " + arrayDeque);

    System.out.println("arr[0] = " + arr[0]);
    System.out.println("list.get(0) = " + list.get(0));
    System.out.println("linkedList.get(0) = " + linkedList.get(0));
    System.out.println("vector.get(0) = " + vector.get(0));
    System.out.println("stack.get(0) = " + stack.get(0));


    System.out.println("stack.peek() = " + stack.peek());

    HashSet<Integer> hashSet = new HashSet<>(list);
    System.out.println("hashSet = " + hashSet);

    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(list);
    System.out.println("linkedHashSet = " + linkedHashSet);

    TreeSet<Integer> treeSet = new TreeSet<>(list);
    System.out.println("treeSet = " + treeSet);

    Set<Integer> set = new HashSet<>();
    set.addAll(Arrays.asList(1,2,3,4,5));
    System.out.println(new ArrayList<>(set).get(2));

    Map<String, Object> stringMap = new TreeMap<>();
    stringMap.put("name", "Steven");
    stringMap.put("gender", 'M');
    stringMap.put("age", 33);
    System.out.println(stringMap);


    // we do not have get function for Queue interface, because it does not have index number
    // PriorityQueue maintains random order
    System.out.println("priorityQueue.peek() = " + priorityQueue.peek());

    System.out.println("arrayDeque.peek() = " + arrayDeque.peek());

  }
}

class Bird{
  public String name;
  public int age;

  public Bird(String name) {
    this.name = name;
  }

  public Bird(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
