package interview_tasks.collection_map_tasks;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://www.geeksforgeeks.org/print-characters-frequencies-order-occurrence/
 */
public class S51_Map_FrequencyOfCharacters {

    // Write a method that prints the frequency of each character from a String

    public static void main(String[] args) {
        defaultSolution("genius");
    }

    public static void defaultSolution(String  str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        System.out.println(map);
    }
}
