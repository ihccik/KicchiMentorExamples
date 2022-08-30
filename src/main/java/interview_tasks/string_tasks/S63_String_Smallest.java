package interview_tasks.string_tasks;

/**
 * https://www.geeksforgeeks.org/lexicographically-smallest-string-formed-by-removing-at-most-one-character/
 */
public class S63_String_Smallest {
    /*
        Remove one letter from a word so that resulting string will be as small as possible (alphabetically).

        Write a function solution that, given a string S consisting of N characters,
        returns the alphabetically smallest string that can be obtained by removing exactly one letter from S.

        EXAMPLE:
        input: "acb"
        output: "ab"
        explanation:
            by removing one letter, you can obtain "ac", "ab" or "cb"
            return "ab" (after removing 'c') since it is alphabetically smaller than "ac" and "bc"

        EXAMPLE:
        input: "hot"
        output: "ho"
        explanation: return "ho", which is alphabetically smaller than "ht" and "ot"

        EXAMPLE:
        input: "codility"
        output: "cdility"

        EXAMPLE:
        input: "aaaa"
        output: "aaa"
        explanation: Any occurrence of 'a' can be removed
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution("codility"));
    }

    public static String defaultSolution(String s) {
        int l = s.length();
        String result = "";
        for (int i = 0; i < l-1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                for (int j = 0; j < l; j++) {
                    if (i != j) {
                        result += s.charAt(j);
                    }
                }
                return result;
            }
        }
        result = s.substring(0, l - 1);
        return result;
    }
}
