package interview_tasks.string_tasks;

public class S4_String_RemoveExtraSpaces {

    /*
        Remove All Extra Space from String

        EXAMPLE:
        Input: "  Hello world      I      love      Java    "
        Output: Hello world I love Java
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution("  Hello world      I      love      Java    "));
    }

    public static String defaultSolution(String sentence) {
        String[] words = sentence.trim().split(" ");
        String result = "";

        for (String each : words) {
            if (!each.isEmpty()) {
                result += each + " ";
            }
        }

        return result.trim();
    }
}
