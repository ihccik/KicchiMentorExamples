package interview_tasks.array_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/word-break/
 * https://www.geeksforgeeks.org/word-break-problem-dp-32/
 */
public class S72_Array_WordBreakProblem {

    /*
        Word Break Problem
        Given an input string and a dictionary of words, find out if the input string can be segmented
        into a space-separated sequence of dictionary words. See following examples for more details.
        This is a famous Google interview question, also being asked by many other companies now a days.
        Consider the following dictionary

        dictionary: { i, like, sam, sung, samsung, mobile, ice, cream, icecream, man, go, mango}
        EXAMPLE:
        Input:  ilike
        Output: true
        Explanation: The string can be segmented as "i like".

        EXAMPLE:
        Input:  ilikesamsung
        Output: true
        Explanation: The string can be segmented as "i like samsung" or "i like sam sung".
     */

    public static void main(String[] args) {
        //ArrayList<String> dictionary = new ArrayList<>(Arrays.asList("i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"));
        //segments(dictionary, "ilike");
        //System.out.println(segments(dictionary, "ilikesamsung"));;

        //ArrayList<String> dictionary = new ArrayList<>(Arrays.asList("leet", "code"));
        //System.out.println(segments(dictionary, "leetcode"));;

        ArrayList<String> dictionary = new ArrayList<>(Arrays.asList("cats","dog","sand","and","cat"));
        System.out.println(kicchiSolution(dictionary, "catsandog"));;
    }

    public static boolean defaultSolution() {
        String[] dictionary = {"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"};
        String input = "ilikesamsung";

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                String temp = input.substring(i, j+1);
               if(Arrays.asList(dictionary).contains(temp) ){
                   if(!words.contains(temp)) {
                       words.add(temp);
                   }
               }
            }
        }

       return words.size() > 0;
    }

    //@kicchi not passing all tests on leetcode
    public static boolean kicchiSolution(List<String> dictionary, String input){
        ArrayList<ArrayList<String>> segments = new ArrayList<>();
        ArrayList<String> matches = new ArrayList<>();
        String currentPartOfInput = "";
        int remainingPartDeterminerIndex = 0;

        for (int i = 0; i < dictionary.size(); i++) {
            String currentDictionaryWord = dictionary.get(i);
            if (remainingPartDeterminerIndex + currentDictionaryWord.length() <= input.length())
                currentPartOfInput = input.substring(remainingPartDeterminerIndex, remainingPartDeterminerIndex + currentDictionaryWord.length());
            else{
                if (!matches.isEmpty())
                    segments.add(matches);

                if (input.substring(0, remainingPartDeterminerIndex).endsWith(currentDictionaryWord)){
                    ArrayList<String> postMatch = new ArrayList<>();
                    for (String strFromLast: matches) {
                        if (!currentDictionaryWord.startsWith(strFromLast) && !currentDictionaryWord.endsWith(strFromLast)){
                            postMatch.add(strFromLast);
                        }
                    }
                    postMatch.add(currentDictionaryWord);
                    segments.add(postMatch);
                }
                break;
            }

            if (currentDictionaryWord.equals(currentPartOfInput)){
                matches.add(currentPartOfInput);
                remainingPartDeterminerIndex += currentDictionaryWord.length();
            }else {
                return false;
            }
        }
        if (!matches.isEmpty())
            segments.add(matches);

        return segments.size() != 0;
    }
}
