package interview_tasks.number_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S61_Number_LovelyNumber {

   /*
        Write a function solution that, given integers A and B, returns
        the number of lovely integers in the range [A..B] (both ends included).

        LOVELY NUMBER:
        We consider a number to be lovely if it contains fewer than
        three instances of any distinct digit (in decimal representation).
        Examples of lovely numbers: 0, 100, 1232 and 9922;
        Examples of numbers that are not lovely: 1000 (contains three copies of digit '0'), 33533 (contains four copies of digit '3').

        EXAMPLE:
        inputs: 0, 0
        output: 1
        explanation: because 0 is lovely.

        EXAMPLE:
        inputs: 1, 111
        output: 110
        explanation: because the only integer in the range [1..111] that is not lovely is 111.

        EXAMPLE:
        inputs: 100000, 100000
        output: 0
        explanation: because 100000 is not lovely.
    */

    public static void main(String[] args) {
        System.out.println(defaultSolution(1, 111));
    }

    public static int defaultSolution(int a, int b){
        int count = 0;
        for (int i = a; i <= b; i++) {
            List<String> list = new ArrayList<>(Arrays.asList((i+"").split("")));
            boolean result = false;

            for (String each : list) {
                if(Collections.frequency(list, each) < 3)
                    result = true;
            }
            if(result) {
                count++;
            }
        }

        return count;
    }
}
