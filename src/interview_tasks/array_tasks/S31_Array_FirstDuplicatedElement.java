package interview_tasks.array_tasks;

/**
 * https://www.geeksforgeeks.org/find-first-repeating-element-array-integers/
 */
public class S31_Array_FirstDuplicatedElement {

    /*
        write a program that can find the first duplicated element from the array

        EXAMPLE:
        Input:  arr[] = {10, 5, 3, 4, 3, 5, 6}
        Output: 5 [5 is the first element that repeats]

        EXAMPLE
        Input:  arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}
        Output: 6 [6 is the first element that repeats]
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution(new int[]{8, 7, 2, 1, 7, 1}));
    }

    public static int defaultSolution(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }

            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }
        }

        return firstDuplicated;
    }
}
