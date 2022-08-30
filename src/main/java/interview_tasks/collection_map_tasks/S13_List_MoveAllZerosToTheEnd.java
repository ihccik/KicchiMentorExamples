package interview_tasks.collection_map_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class S13_List_MoveAllZerosToTheEnd {

    // write a program that can move all the zeros to the end of the List of integers

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(); input.add(3); input.add(0); input.add(5); input.add(0); input.add(4);
        System.out.println(defaultSolution(input));
        System.out.println(kicchiSolution(input));
    }

    public static List<Integer> defaultSolution(List<Integer> list) {
        int originalSize = list.size();
        list.removeAll(Arrays.asList(0));
        int newSize = list.size();
        int totalNumberOfZeros = originalSize - newSize;

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        return list;
    }

    public static List<Integer> kicchiSolution(List<Integer> list) {
        return
        Arrays.stream(
            Arrays.copyOf(list.stream().mapToInt(Integer::intValue).filter(f -> f != 0).toArray(),
                list.size())).boxed().collect(Collectors.toList());
    }
}
