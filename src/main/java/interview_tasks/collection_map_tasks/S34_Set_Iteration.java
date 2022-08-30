package interview_tasks.collection_map_tasks;

import java.util.Iterator;
import java.util.Set;

public class S34_Set_Iteration {
    /*
        how to iterate through a set, at least two ways

        EXAMPLE:
        input:
            Set<String> someObj = Set.<String>of("1", "2", "3", "val1", "val2", "val3");
     */

    public static void main(String[] args) {
        Set<String> input = Set.of("1", "2", "3", "val1", "val2", "val3");
        defaultSolution(input);
    }

    public static void defaultSolution(Set<String> someObj){
        System.out.println("-----------------WAY1------------------");
        for (String each : someObj) {
            System.out.println(each);
        }

        System.out.println("-----------------WAY2------------------");
        for(Iterator it = someObj.iterator(); it.hasNext();){
            System.out.println(it.next());
        }

        System.out.println("-----------------WAY3------------------");
        someObj.forEach( p -> {
            System.out.println(p);
        });
    }
}
