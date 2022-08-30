package week14;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class ArrayAndArrayList {

  public static void main(String[] args) {
    int[] myArray = new int[5];
    myArray[0] = 12;
    myArray[myArray.length - 1] = 23;

    for (int element: myArray) {
      System.out.println(element);
    }

    Dog[] dogs = new Dog[3];
    dogs[0] = new Dog("Boza");

    for (Dog dog: dogs) {
      System.out.println(dog);
    }

    ArrayList<Dog> dogList = new ArrayList<>();
    System.out.println(dogList);
    dogList.add(new Dog("Duman"));
    System.out.println(dogList);
    dogList.add(0, new Dog("Boza"));
    System.out.println(dogList);

    List<Dog> dogList2 = new ArrayList<>();
    Dog dogChomar = new Dog("Chomar");
    dogList2.add(dogChomar);
    dogList2.remove(dogChomar);
    System.out.println(dogList2);

    HashMap<String , Integer> studentNotes = new HashMap<>();
    studentNotes.put("Nathan", 56);

    Map<String, Integer> studentNotesAsInterface = studentNotes;
    System.out.println("studentNotesAsInterface.size() = " + studentNotesAsInterface.size());

    Stack<Dog> dogStack = new Stack<>();
    dogStack.push(new Dog("Boza"));
    dogStack.push(new Dog("Duman"));
    dogStack.push(new Dog("Chomar"));

    System.out.println("dogStack.pop() = " + dogStack.pop());//we are removing Chomar
    System.out.println(dogStack.size());

    System.out.println("dogStack.peek() = " + dogStack.peek());
    System.out.println("dogStack.size() = " + dogStack.size());

    Queue<Dog> dogQueue = new ArrayDeque<>();

  }
}
