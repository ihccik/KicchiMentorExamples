package interview_tasks.array_tasks;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
 */
public class S11_Array_Reverse {

    /*
        write a function that can reverse an array

        EXAMPLE:
        Input  : arr[] = {1, 2, 3}
        Output : arr[] = {3, 2, 1}
     */

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(defaultSolution(new int[]{4,9,0})));
        System.out.println(Arrays.toString(kicchiSolution(new int[]{4,9,0})));
        System.out.println(Arrays.toString(kicchiSolution(new int[]{4,9,0,6,8})));
        System.out.println(Arrays.toString(kicchiSolution(new int[]{4,9,0,6})));
    }

    public static int[] defaultSolution(int[] arr){
        int[] result = new int[arr.length];

        for(int i = arr.length-1, j=0; i >= 0 ; i--, j++){
            result[j] = arr[i];
        }

        return result;
    }

    public static int[] kicchiSolution(int[] arr){
        int lastVal = arr[arr.length - 1];
        for (int i = 0, j = arr.length - 1; i < arr.length - 1 && j >= 0; i++, j--) {
            if (i == arr.length / 2)
                break;

            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            if (i == j)
                break;
        }
        return arr;
    }
}
