package interview_tasks.number_tasks;

public class S44_Number_MaximumPossibleValue {

    /*
        Write a function solution that, given an integer N, returns the maximum possible value
        obtained by inserting one '5' digit inside the decimal representation of integer N.

        Assume that:
            • N is an integer within the range (-8,000..8,000).

        EXAMPLE:
        Input: 268
        Output: 5268
        Explanation:
            Possible outputs when we insert 5 => 5268, 2568, 2658, 2685
            Maximum of variations is : 5268

        EXAMPLE:
        Input: 670
        Output: 6750

        EXAMPLE:
        Input: 0
        Output: 50

        EXAMPLE:
        Input: -999
        Output: -5999
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution(-999));
        System.out.println(defaultSolution(268));
    }

    public static int defaultSolution(int N) {
        String s = "" + Math.abs(N);
        int max = Integer.valueOf(s + 5);
        if (N > 0) {
            for (int i = 0; i < s.length(); i++) {
                String c = "" + s.charAt(i);
                String t = s.replaceFirst(c, 5 + c);
                if (Integer.valueOf(t) > max) {
                    max = Integer.valueOf(t);
                }
            }
        } else if (N < 0) {
            for (int i = 0; i < s.length(); i++) {
                String c = "" + s.charAt(i);
                String t = s.replaceFirst(c, 5 + c);
                if (Integer.valueOf(t) < max) {
                    max = Integer.valueOf(t);
                }
            }
            max = -max;
        } else {
            max = 50;
        }
        return max;
    }
}
