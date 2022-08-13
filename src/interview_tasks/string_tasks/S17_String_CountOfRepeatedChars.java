package interview_tasks.string_tasks;

/**
 * https://www.geeksforgeeks.org/printing-frequency-of-each-character-just-after-its-consecutive-occurrences/
 * https://www.geeksforgeeks.org/print-characters-and-their-frequencies-in-order-of-occurrence-using-a-linkedhashmap-in-java/?ref=rp
 * https://www.geeksforgeeks.org/print-characters-and-their-frequencies-in-order-of-occurrence-using-binary-tree/?ref=rp
 */
public class S17_String_CountOfRepeatedChars {
    /*
        Write a method that compresses a string based on the count of repeated characters.
        In other words: Printing frequency of each character just after its CONSECUTIVE occurrences

        EXAMPLE:
        input: aabcccddaaaa
        output: a2b1c3d2a4
        explanation:    a is repeated consecutively (not in WHOLE string) for 2 times   => a2
                        then, b occurred for one time                                   => a2b1
                        then, c occurred for three times                                => a2b1c3
                        then, d occurred for 2 times                                    => a2b1c3d2
                        then, again, a is repeated for 4 times                          => a2b1c3d2a4
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution("aabcccddaaaa"));
        System.out.println(kicchiSolution("aabcccddaaaa"));;
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

    public static String kicchiSolution(String str){
        String output = "";
        int currentCharCount = 0;
        Character lastCharProcessed = null;
        for (int i = 0; i < str.length(); i++) {
            if (lastCharProcessed == null)
                lastCharProcessed = str.charAt(i);

            if (str.charAt(i) == lastCharProcessed){
                currentCharCount++;

                if (i == str.length() - 1)
                    output += lastCharProcessed + "" + currentCharCount;
            }else {
                output += lastCharProcessed + "" + currentCharCount;
                currentCharCount = 0;
                lastCharProcessed = null;
                i--;
            }
        }

        return output;
    }
}
