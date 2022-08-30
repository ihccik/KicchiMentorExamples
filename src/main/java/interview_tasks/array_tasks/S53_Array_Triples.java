package interview_tasks.array_tasks;

public class S53_Array_Triples {
    /*
        Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
        Return true if the array does not contain any triples.

        EXAMPLE:
        input: [1, 1, 2, 2, 1]
        output: true

        EXAMPLE:
        input: [1, 1, 2, 2, 2, 1]
        output: false

        EXAMPLE:
        input: [1, 1, 1, 2, 2, 2, 1]
        output: false
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution(new int[]{1, 1, 2, 2, 1}));
        System.out.println(defaultSolution(new int[]{1, 1, 2, 2, 2, 1}));
    }

    public static boolean defaultSolution(int[] numbers){
        for (int i = 0; i < numbers.length-2; i++) {
            if(numbers[i] == numbers[i+1] && numbers[i] == numbers [i+2]){
                return false;
            }
        }
        return true;
    }
}
