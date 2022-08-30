package interview_tasks.string_tasks;

public class S22_String_ReverseSecondWord {

    /*
        Reverse the second word ONLY

        EXAMPLE:
            Input: I Love Java
            OutPut: I evoL Java
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution("I Love Java"));
    }

    public static String defaultSolution(String sentence) {
        String[] words = sentence.split(" ");
        String reversed = "";

        for (int i = words[1].length() - 1; i >= 0; i--){
            reversed += words[1].charAt(i);
        }

        words[1] = reversed;
        String result = "";

        for (String each : words) {
            result += each + " ";
        }

        return result.trim();
    }
}
