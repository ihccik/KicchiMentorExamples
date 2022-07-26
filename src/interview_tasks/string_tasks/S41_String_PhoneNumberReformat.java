package interview_tasks.string_tasks;

public class S41_String_PhoneNumberReformat {

    /*
        Given a string S representing a phone number, write a function
        that returns this phone number reformatted as described below.

        We are given a string S representing a phone number, which we would like to reformat.
        String S consists of N characters: digits, spaces and/or dashes.
        It contains at least two digits. Spaces and dashes in string S can be ignored.

        We want to reformat the given phone number in such a way that the digits are
        grouped in blocks of length three, separated by single dashes.
        If necessary, the final block or the last two blocks can be of length two.

        Assume that:
        • N is an integer within the range [2..100];
        • string S consists only of digits (0-9), spaces and/or dashes (-);
        • string S contains at least two digits.

        EXAMPLE:
        input: "00-44 48 5555 8361"
        output: "004-448-555-583-61"

        EXAMPLE:
        input: "00-44 48 5555 8361"
        output: "004-448-555-583-61"

        EXAMPLE:
        input: "O 22 1985--324"
        output: "022-198-53-24"

        EXAMPLE:
        input:"555372654"
        output: "555-372-654"
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution("00-44 48 5555 8361"));
    }

    public static String defaultSolution(String S) {
        S = S.replace("-", "").replace(" ", "");
        String result = "";
        if (S.length() % 3 > 1 || S.length() % 3 == 0) {
            for (int i = 0, j = 0; i < S.length(); i++) {
                result += S.charAt(i);
                j++;
                if (j == 3) {
                    result += "-";
                    j = 0;
                }
            }
            if (S.length() % 3 == 0) {
                result = result.substring(0, result.length() - 1);
            }
        } else if (S.length() % 3 == 1) {
            for (int i = 0, j = 0; i < S.length() - 2; i++) {
                result += S.charAt(i);
                j++;
                if (j == 3) {
                    result += "-";
                    j = 0;
                }
            }
            result += "-" + S.substring(S.length() - 2);
        }
        return result;
    }
}
