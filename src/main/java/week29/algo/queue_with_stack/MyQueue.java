package week29.algo.queue_with_stack;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    // The idea is to implement the queue’s enqueue operation so that
    // the first entered element always ends up at the top of the stack.
    // To achieve this, we need an additional stack.
    Stack<Integer> stack2 = new Stack<>();

    // To enqueue an item into the queue, first move all elements from the first stack to the second stack,
    // push the item into the first stack, and finally move all elements back to the first stack.
    // This ensures that the new item lies at the bottom of the stack and hence would be the last one to be removed.
    // (1) Push x to stack1 (assuming size of stacks is unlimited). Here time complexity will be O(1)
    public void enqueue(int num) {
        stack1.push(num);
    }

    // To dequeue an item from the queue, return the top item from the first stack.
    // 1) If both stacks are empty => then error.
    // 2) If stack2 is empty => While stack1 is not empty, push everything from stack1 to stack2.
    // 3) Pop the element from stack2 and return it.
    // Here time complexity will be O(n)
    public int dequeue() {
        peek();
        return stack2.pop();
    }

    public int peek() {
        if (stack2.empty())
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.empty() && stack2.empty();
    }
}

