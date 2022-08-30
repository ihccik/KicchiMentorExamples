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
        //System.out.println(kicchiSolution(dictionary, "ilike"));

        //ArrayList<String> dictionary = new ArrayList<>(Arrays.asList("i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"));
        //System.out.println(defaultSolution(dictionary, "ilikesamsung"));

        //ArrayList<String> dictionary = new ArrayList<>(Arrays.asList("leet", "code"));
        //System.out.println(defaultSolution(dictionary, "leetcode"));

        ArrayList<String> dictionary = new ArrayList<>(Arrays.asList("cats","dog","sand","and","cat"));
        System.out.println(kicchiSolution(dictionary, "catsandog"));

        //ArrayList<String> dictionary = new ArrayList<>(Arrays.asList("a","b","bbb","bbbb"));
        //System.out.println(kicchiSolution(dictionary, "bb"));

        //ArrayList<String> dictionary = new ArrayList<>(Arrays.asList("apple","pen"));
        //System.out.println(kicchiSolution(dictionary, "applepenapple"));

        //ArrayList<String> dictionary = new ArrayList<>(Arrays.asList("i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"));
        //System.out.println(defaultSolution(dictionary, "ilikesamsung"));
    }

    /**
     * this code has a bug for these inputs
     * "catsandog"
     * ["cats","dog","sand","and","cat"]
     * //expected false but returning true
     */
    public static boolean defaultSolution(ArrayList<String> dictionary, String input) {
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                String temp = input.substring(i, j+1);
               if(dictionary.contains(temp) ){
                   if(!words.contains(temp)) {
                       words.add(temp);
                   }
               }
            }
        }

       return words.size() > 0;
    }

    private static ArrayList<ArrayList<String>> segments = new ArrayList<>();
    private static String baseInput = "";
    //@kicchi not passing all tests on leetcode
    public static boolean kicchiSolution(List<String> dictionary, String input){
        baseInput = input;
        getMatches(dictionary, input, new ArrayList<>());

        return segments.size() != 0;
    }

    private static void getMatches(List<String> dictionary, String currentInput, ArrayList<String> matches){
        String currentPartOfInput = "";
        int remainingPartDeterminerIndex = 0;

        for (int i = 0; i < dictionary.size(); i++) {
            String currentDictionaryWord = dictionary.get(i);
            if (remainingPartDeterminerIndex + currentDictionaryWord.length() <= currentInput.length())
                currentPartOfInput = currentInput.substring(remainingPartDeterminerIndex, remainingPartDeterminerIndex + currentDictionaryWord.length());
            else{
                if (!matches.isEmpty() && matches.stream().mapToInt(s -> s.length()).sum() == baseInput.length())
                    segments.add(matches);

                /*if (input.substring(0, remainingPartDeterminerIndex).endsWith(currentDictionaryWord)){
                    ArrayList<String> postMatch = new ArrayList<>();
                    for (String strFromLast: matches) {
                        if (!currentDictionaryWord.startsWith(strFromLast) && !currentDictionaryWord.endsWith(strFromLast)){
                            postMatch.add(strFromLast);
                        }
                    }
                    postMatch.add(currentDictionaryWord);
                    segments.add(postMatch);
                }*/
                break;
            }

            if (currentDictionaryWord.equals(currentPartOfInput)){
                matches.add(currentPartOfInput);
                remainingPartDeterminerIndex += currentDictionaryWord.length();
            }else {

            }
        }

        String remainingInput = currentInput.substring(remainingPartDeterminerIndex);
        if (!matches.isEmpty() && matches.stream().mapToInt(s -> s.length()).sum() == currentInput.length())
            segments.add(matches);
        else if (!remainingInput.isEmpty() && dictionary.stream().anyMatch(w -> remainingInput.contains(w)))
            getMatches(dictionary, remainingInput, matches);
    }
}
