package interview_tasks.collection_map_tasks;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.geeksforgeeks.org/intersection-of-n-sets/
 */
public class S35_Set_Intersection {

    /*
        Write a method that returns a new Set equal to the intersection of the parameter Sets
        Returned Set should be equal to the intersection of the parameter Sets (must only contain same values of the input sets)
        The method should not change the content of the parameters.
     */

    public static void main(String[] args) {
        Set<Object> input1 = new HashSet<>();
        input1.add(4);
        input1.add(6);

        Set<Object> input2 = new HashSet<>();
        input2.add(4);
        input2.add(6);
        input2.add(10);

        System.out.println(defaultSolution(input1, input2));
    }

    public static Set<Object> defaultSolution(Set<Object> a, Set<Object> b) {
        if (a.size() > b.size()) {
            a.retainAll(b);
            return a;
        } else {
            b.retainAll(a);
            return b;
        }
    }
}
