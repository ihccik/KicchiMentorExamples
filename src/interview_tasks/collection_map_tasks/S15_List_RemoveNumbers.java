package interview_tasks.collection_map_tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class S15_List_RemoveNumbers {

    // Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(101); input.add(99); input.add(200);

        System.out.println(defaultSolution1(input));
        System.out.println(defaultSolution2(input));
        System.out.println(kicchiSolution(input));
    }

    public static List<Integer> defaultSolution1(List<Integer> list){
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            if(it.next()>100){
                it.remove();
            }
        }
        return list;
    }

    public static List<Integer> defaultSolution2(List<Integer> list){
        list.removeIf(number -> number > 100);
        return list;
    }

    public static List<Integer> kicchiSolution(List<Integer> list) {
        return list.stream().filter(f -> f < 100).collect(Collectors.toList());
    }
}
