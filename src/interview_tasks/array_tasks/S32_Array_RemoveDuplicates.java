package interview_tasks.array_tasks;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/remove-duplicates-sorted-array/
 * https://www.geeksforgeeks.org/remove-duplicates-from-unsorted-array-using-map-data-structure/
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 */
public class S32_Array_RemoveDuplicates {

    /*
        Write a function that can remove the duplicates from an array of integers

        EXAMPLE:
        Input : arr[] = { 1, 2, 5, 1, 7, 2, 4, 2}
        Output : 1 2 5 7 4
        Explanation : {1, 2} appear more than one time.
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(defaultSolution1(new int[]{4,5,4,7,1,6,6})));
        System.out.println(Arrays.toString(defaultSolution2(new int[]{4,5,4,7,1,6,6})));
    }

    public static int[] defaultSolution1(int[] array){
        return Arrays.stream(array).distinct().toArray();
    }

    public static int[] defaultSolution2(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for(int each: array){
            if(!list.contains(each)){
                list.add(each);
            }
        }

        array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }
}
