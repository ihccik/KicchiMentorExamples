package interview_tasks.string_tasks;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S3_String_PrintEmail {
    /*
        Given a String that contains email address, write a function that extracts and returns the email only
        Do not use substring function.

        EXAMPLE:
        input: "I love Java name@gmail.com, I don't like python";
        output: name@gmail.com
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution1("I love Java name@gmail.com, I don't like python"));
        System.out.println(defaultSolution2("I love Java name@gmail.com, I don't like python"));
        System.out.println(kicchiSolution("I love Java name@gmail.com, I don't like python"));
    }

    private static String defaultSolution1(String sentence){
        Matcher match = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(sentence);
        return match.find() ? match.group() : null;
    }

    private static String defaultSolution2(String sentence){
        return sentence.replaceAll(".*\\b(\\w\\S*@\\S*\\w)\\b.*", "$1");
    }

    private static String kicchiSolution(String sentence){
        String dirtyEmail = Arrays.stream(sentence.split(" ")).filter(p -> p.contains("@")).findFirst().get();
        dirtyEmail = new StringBuilder(dirtyEmail).reverse().toString();

        while (!Character.isLetter(dirtyEmail.charAt(0))){
            dirtyEmail = dirtyEmail.replaceFirst("" + dirtyEmail.charAt(0), "");
        }
        return new StringBuilder(dirtyEmail).reverse().toString();
    }
}
