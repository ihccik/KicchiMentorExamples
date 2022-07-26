package algo_muh;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/word-break/
 * https://www.geeksforgeeks.org/word-break-problem-dp-32/
 */
public class Array_WordBreakProblem {
/*
Word Break Problem
    Given an input string and a dictionary of words, find out if the input string can be segmented
    into a space-separated sequence of dictionary words. See following examples for more details.
    This is a famous Google interview question, also being asked by many other companies now a days.
    Consider the following dictionary
        { i, like, sam, sung, samsung, mobile, ice, cream, icecream, man, go, mango}
        Input:  ilike
        Output: Yes
        The string can be segmented as "i like".
        Input:  ilikesamsung
        Output: Yes
        The string can be segmented as "i like samsung" or "i like sam sung".
 */

  public static void main(String[] args) {
    String[] dictionary = new String[]{"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"};
    //segments(dictionary, "ilike");
    System.out.println(segments(dictionary, "ilikesamsung"));;
  }

  public static ArrayList<ArrayList<String>> segments(String[] dictionary, String input){
    ArrayList<ArrayList<String>> segments = new ArrayList<>();
    ArrayList<String> matches = new ArrayList<>();
    String remainingPartOfInput = "";
    String currentPartOfInput = "";
    int remainingPartDeterminerIndex = 0;

    for (int i = 0; i < dictionary.length; i++) {
      if (remainingPartDeterminerIndex + dictionary[i].length() <= input.length())
        currentPartOfInput = input.substring(remainingPartDeterminerIndex, remainingPartDeterminerIndex + dictionary[i].length());
      else{
        if (!matches.isEmpty())
          segments.add(matches);

        if (input.substring(0, remainingPartDeterminerIndex).endsWith(dictionary[i])){
          ArrayList<String> postMatch = new ArrayList<>();
          for (String strFromLast: matches) {
            if (!dictionary[i].startsWith(strFromLast) && !dictionary[i].endsWith(strFromLast)){
              postMatch.add(strFromLast);
            }
          }
          postMatch.add(dictionary[i]);
          segments.add(postMatch);
        }
        break;
      }

      if (dictionary[i].equals(currentPartOfInput)){
        matches.add(currentPartOfInput);
        remainingPartDeterminerIndex += dictionary[i].length();
      }else {

      }
    }
    return segments;
  }
}
