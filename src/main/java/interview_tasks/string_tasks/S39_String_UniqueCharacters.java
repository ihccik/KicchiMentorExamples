package interview_tasks.string_tasks;

/**
 * similar to String_FirstUniqueCharacter task but need a further step
 */
public class S39_String_UniqueCharacters {

    /*
        Write a method that can find the unique characters from the input String and returns as a String

        EXAMPLE:
        Input: "AAABBBCCCDEF"
        Output: "DEF"
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution("AAABBBCCCDEF"));
    }

    public static String defaultSolution(String str) {
        String[] arr = str.split("");
        String unique1 = "";

        for (int j = 0; j < arr.length; j++) {
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    num++;
                }
            }
            if (num == 1) {
                unique1 += arr[j];
            }
        }

        return unique1;
    }
}
