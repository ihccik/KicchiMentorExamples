package interview_tasks.collection_map_tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * https://www.geeksforgeeks.org/sorting-a-hashmap-according-to-values/
 */
public class S70_Map_SortByValues {

    /*
        Write a method that can sort the map by values

        EXAMPLE:
        Input :
        Key = Math, Value = 98
        Key = Data Structure, Value = 85
        Key = Database, Value = 91
        Key = Java, Value = 95
        Key = Operating System, Value = 79
        Key = Networking, Value = 80

        Output :
         Key = Operating System, Value = 79
         Key = Networking, Value = 80
         Key = Data Structure, Value = 85
         Key = Database, Value = 91
         Key = Java, Value = 95
         Key = Math, Value = 98
     */

    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<>();
        input.put("me", 2);
        input.put("he", 1);
        input.put("we", -10);

        System.out.println(defaultSolution(input));
    }

    public static Map<String, Integer> defaultSolution(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }

        return map;
    }
}
