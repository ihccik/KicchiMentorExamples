package interview_tasks.string_tasks;

public class S5_String_SumOfAllIntegers {

    /*
        Find the sum of all integers found in the parameter String.
        You can assume that integers are separated from other parts with one or more spaces (' ' symbol).

        EXAMPLE:
        input = "12 some text 3 7"
        output: 22
        explanation: 12+3+7=22
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution("12 some text 3 7"));
    }

    public static int defaultSolution(String s) {
        int sum = 0;
        String[] numbers = s.replaceAll("[\\D]+"," ").split(" ");

        for(String each : numbers){
                sum+=Integer.parseInt(each);
        }
        return sum;
    }
}
