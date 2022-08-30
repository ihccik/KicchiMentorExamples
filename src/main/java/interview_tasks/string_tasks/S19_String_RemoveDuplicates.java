package interview_tasks.string_tasks;

public class S19_String_RemoveDuplicates {
    /*
        Write function that can remove the duplicated values from String

        EXAMPLE:
        input: "AAABBBCCC"
        output: ABC
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution("AAABBBCCC"));
    }

    public static String defaultSolution(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }

        return result;
    }
}