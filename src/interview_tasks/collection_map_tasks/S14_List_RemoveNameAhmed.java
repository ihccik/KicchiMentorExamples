package interview_tasks.collection_map_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class S14_List_RemoveNameAhmed {

    /*
        Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
        Write a java operation to remove all the names named Ahmed
     */

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmed"); names.add("John"); names.add("Eric"); names.add("Ahmed");

        System.out.println(defaultSolution1(names));
        System.out.println(defaultSolution2(names));
        System.out.println(defaultSolution3(names));
    }

    public static List<String> defaultSolution1(List<String> names) {
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Ahmed"))
                it.remove();
        }
        return names;
    }

    public static List<String> defaultSolution2(List<String> names) {
        names.removeAll(Arrays.asList("Ahmed"));
        return names;
    }

    public static List<String> defaultSolution3(List<String> names) {
        names.removeIf(name -> name.equals("Ahmed"));
        return names;
    }
}
