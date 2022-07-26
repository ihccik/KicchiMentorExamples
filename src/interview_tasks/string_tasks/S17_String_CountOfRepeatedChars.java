package interview_tasks.string_tasks;

/**
 * https://www.geeksforgeeks.org/printing-frequency-of-each-character-just-after-its-consecutive-occurrences/
 * https://www.geeksforgeeks.org/print-characters-and-their-frequencies-in-order-of-occurrence-using-a-linkedhashmap-in-java/?ref=rp
 * https://www.geeksforgeeks.org/print-characters-and-their-frequencies-in-order-of-occurrence-using-binary-tree/?ref=rp
 *
 * This task is the same with String_FrequencyOfCharacters
 */
public class S17_String_CountOfRepeatedChars {
    /*
        Write a method that compresses a string based on the count of repeated characters.

        EXAMPLE:
        input: aabcccddaaaa
        output: a2b1c3d2a4
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution("aabcccddaaaa"));
    }

    public static String defaultSolution(String str){
        String result = "";
        int count = 0;
        char temp = str.charAt(0);

        for (char c : str.toCharArray()) {
            if(temp == c) {
                count++;
            } else {
                result +=  ""+temp + count;
                temp = c;
                count = 1;
            }
        }
        result += ""+temp + count;

        return result;
    }
}
