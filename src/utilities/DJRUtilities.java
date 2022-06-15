package utilities;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * This class is a live class, ever-growing with the contributions of all DJR members.
 * Consist of code samples to look for when we need to review or remember the Java coding structure.
 * Thanks to @Nina @Glen @Ekaterina @Sumeye @Yusuf @Yuliia @Sebastian, @Mehmet and @kicchi
 */
public class DJRUtilities {

  /**
   * <p>Coded by @kicchi</p>
   * checks if a year is a leap year or not
   * @param year year to check
   * @return
   */
  public static boolean isLeapYear(int year){
    System.out.println("year = " + year);
    boolean isLeapYear = false;

    if (year % 4 == 0){
      if (year % 100 == 0){
        if (year % 400 == 0) {
          isLeapYear = true;
        }
      }else {
        isLeapYear = true;
      }
    }

    return isLeapYear;
  }

  /**
   * <p>Coded by @kicchi</p>
   * Converts char to String
   * @param convertMeToString char to be converted
   */
  public static String charToString(char convertMeToString){
    String stringFromChar = "";
    //way 1
    stringFromChar = "" + convertMeToString;
    //way 2
    stringFromChar = Character.toString(convertMeToString);
    //way 3
    stringFromChar = String.valueOf(convertMeToString);

    return stringFromChar;
  }

  /**
   * <p>Coded by @kicchi</p>
   * Adds Characters to provided String parameter
   * Example Input:
   * Input custom string = Hello
   * Output:
   * --> String to be added 'Dirty'
   *     --> If end position, Output: HelloDirty
   *     --> If in beginning, Output: DirtyHello
   *     --> If at sat 3rd index, Output: HelDirtylo
   * Print all three versions of addition
   */
  public static void addCharactersToString(String inputString, String strToBeAdded){
    //add to start
    String addToStart = strToBeAdded + inputString;
    System.out.println("addToStart = " + addToStart);

    //add to middle
    int middleIndex = inputString.length() / 2;
    String addToMiddle = inputString.substring(0, middleIndex) + strToBeAdded + inputString.substring(middleIndex);
    System.out.println("addToMiddle = " + addToMiddle);

    //add to end
    String addToEnd = inputString + strToBeAdded;
    System.out.println("addToEnd = " + addToEnd);
  }

  /**
   * <p>Coded by @kicchi</p>
   * Converts String to float
   * @param strToBeConverted
   * @return
   */
  public static float convertStringToFloat(String strToBeConverted){
    float floatFromString = Float.parseFloat(strToBeConverted);

    return floatFromString;
  }

  /**
   * <p>Coded by @kicchi</p>
   * Replaces all occurrences of a given char
   * @param inputString
   * @param charToReplace
   * @param charToPut
   * @return
   */
  public static String replaceCharactersInString(String inputString, char charToReplace, char charToPut){
    String newString = "";
    int inputStrLength = inputString.length();

    for (int i = 0; i < inputStrLength; i++) {
      char currentChar = inputString.charAt(i);
      if (currentChar == charToReplace){
        newString += charToPut;
      }else {
        newString += currentChar;
      }
    }

    return newString;
  }

  /**
   * <p>Coded by @kicchi</p>
   * Prints all Double Quotation Marks in a String
   * @param inputString
   * @return
   */
  public static String printDoubleQuotationMarksInString(String inputString){
    char quotation = '"';
    String allQuotations = "";

    for (int i = 0; i < inputString.length(); i++) {
      if (inputString.charAt(i) == quotation)
        allQuotations += quotation;
    }

    return allQuotations;
  }

  /**
   * <p>Coded by @kicchi</p>
   * Counts Special Characters in a String
   * Special characters are those characters that are neither a letter nor a number.
   * Whitespace is also not considered a special character.
   * Examples of special characters are:- !(exclamation mark), , (comma), #(hash), etc.
   * @param inputString
   * @return
   */
  public static int countSpecialCharactersInString(String inputString){
    // Declaring and initializing count for special characters
    int count = 0;

    // Iterating through the string using standard length() method
    for (int i = 0; i < inputString.length(); i++) {

      // Checking the character for not being a
      // letter,digit or space
      if (!Character.isDigit(inputString.charAt(i))
          && !Character.isLetter(inputString.charAt(i))
          && !Character.isWhitespace(inputString.charAt(i))) {
        // Incrementing the counter for spl characters by unity
        count++;
      }
    }

    return count;
  }

  /**
   * <p>Coded by @kicchi</p>
   * Swaps Corner Words
   * Given a string containing n numbers of words, this method swaps the corner (first and last) words of the string.
   * @param inputString
   * @return
   */
  public static String swapCornerWordsOfSentence(String inputString){
    int indexOfFirstSpace = inputString.indexOf(" ");
    int indexOfLastSpace = inputString.lastIndexOf(" ");

    String leftCornerWord = inputString.substring(0, indexOfFirstSpace);
    String rightCornerWord = inputString.substring(indexOfLastSpace + 1);

    String wordsWithoutCorners = inputString.substring(indexOfFirstSpace, indexOfLastSpace + 1);
    String stringWithSwappedCorners = rightCornerWord + wordsWithoutCorners + leftCornerWord;
    return stringWithSwappedCorners;
  }

  /**
   * <p>Coded by @kicchi</p>
   * Creates new String from words of the provided input String, each in new line
   * Uses SPACE to split sentence
   * @param inputString
   * @return
   */
  public static String getWordsOfSentenceLineByLine(String inputString){
    String newString = "";

    String[] words = inputString.split(" ");
    for (String word:words) {
      if (!word.isEmpty())
        newString += word + "\n";
    }

    return newString;
  }

  /**
   * <p>Coded by @kicchi</p>
   * Replaces words of a sentence without using String replace() function
   * @param inputString
   * @param wordToReplace
   * @param wordToPut
   * @return
   */
  public static String replaceWords(String inputString, String wordToReplace, String wordToPut){
    String outputString = "";
    String currentWord = "";

    for (int i = 0; i < inputString.length(); i++) {
      if (inputString.charAt(i) == ' ' || i == inputString.length() -1) {
        if(currentWord.equals(wordToReplace)){
          outputString += " " + wordToPut;
        }else {
          outputString += " " + currentWord;
        }
        currentWord = "";
      }
      else {
        currentWord += inputString.charAt(i);
      }
    }

    return outputString;
  }

  /**
   * <p>Coded by @kicchi</p>
   * Moves All Uppercase Characters to the End
   * The uppercase characters are in the same order as in the original string.
   * @param inputString
   * @return
   */
  public static String shiftUpperCaseCharsToEnd(String inputString) {
    String outputString = "";
    String uppercaseCharacters = "";

    for (int i = 0; i < inputString.length(); i++) {
      char currentChar = inputString.charAt(i);
      if (currentChar >= 65 && currentChar <= 90) {
        uppercaseCharacters += currentChar;
      } else {
        outputString += currentChar;
      }
    }
    outputString += uppercaseCharacters;
    return outputString;
  }

  /**
   * <p>Coded by @kicchi</p>
   * Extracts the quoted text from a string
   * Quotation should be " (double quotes)
   * @param inputString
   * @return
   */
  public static String extractQuotedText(String inputString){
    int indexOfFirstQuote = inputString.indexOf("\"");
    int indexOfLastQuote = inputString.lastIndexOf("\"");

    String quotedText = inputString.substring(indexOfFirstQuote + 1, indexOfLastQuote);
    return quotedText;
  }

  /**
   * <p>Coded by @kicchi</p>
   * Counts Number of Vowels in a String
   * @param inputString
   * @return
   */
  public static int countNumberOfVowels(String inputString){
    System.out.println("TASK: Count Number of Vowels in a String");
    System.out.println("inputString = " + inputString);

    int count = 0;

    for (int i = 0; i < inputString.length(); i++) {
      char currentChar = inputString.charAt(i);
      // check if char[i] is vowel
      if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i'
          || currentChar == 'o' || currentChar == 'u') {
        count++;
      }
    }

    return count;
  }

  /**
   * <p>Coded by @kicchi</p>
   * Separates the Individual Characters of the provided String
   * Input : string = "DirtyJavaRangers"
   * Output: Individual characters from given string :
   *          D i r t y J a v a R a n g e r s
   * @param inputString
   * @return
   */
  public static String separateIndividualCharacters(String inputString){
    System.out.println("TASK: Separate the Individual Characters from a String");
    System.out.println("inputString = " + inputString);

    String outputString = "";

    for (int i = 0; i < inputString.length(); i++) {
      outputString += inputString.charAt(i) + " ";
    }

    return outputString;
  }

  /**
   * <p>Coded by @kicchi</p>
   * Finds the total addition of numbers (digits) in a string
   * @param inputString
   * @return
   */
  public static int findTheAdditionOfAllNumbersInString(String inputString){
    System.out.println("TASK: Total addition of numbers in a string");
    System.out.println("inputString = " + inputString);

    int totalNumber = 0;

    for (int i = 0; i < inputString.length(); i++) {
      char currentChar = inputString.charAt(i);
      if (currentChar >= 48 && currentChar <= 57)
        totalNumber += Integer.parseInt("" + currentChar);
    }

    return totalNumber;
  }

  /**
   * <p>Coded by @kicchi</p>
   * Finds and returns the index of the first non repeating vowel. If all are repeated or there is no vowel it returns -1
   * @param input
   * @return
   */
  public static int getFirstNonRepeatingVowelIndex(String input){
    for (int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);
      if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u')
      {
        int foundVowelOccurrenceCount = 0;
        for (int j = 0; j < input.length(); j++) {
          if (currentChar == input.charAt(j)){
            foundVowelOccurrenceCount++;
            if (foundVowelOccurrenceCount > 1)
              break;
          }
        }
        if (foundVowelOccurrenceCount == 1)
          return i;
      }
    }
    return -1;
  }

  /**
   * <p>Coded by @kicchi</p>
   * Just prints multiplication table
   */
  public static void printMultiplicationTable(){
    System.out.println("Multiplication Table");

    for (int number1 = 1; number1 < 11; number1++) //iterates over number 1
    {
      for (int number2 = 1; number2 < 11; number2++) //iterates over number 2
      {//this iteration will perform from start for every number1 value
        //we are printing the multiplication of number1 in the same line
        System.out.print(number1 * number2 + " ");
      }
      System.out.println();//this is for the new line, for upcoming number1 values
    }
  }

  /**
   * <p>Coded by @kicchi</p>
   * Prints all prime factors of the input parameter
   * @param n
   */
  public static void printPrimeFactors(int n)
  {
    // Print the number of 2s that divide n
    while (n % 2 == 0) {
      System.out.print(2 + " ");
      n /= 2;
    }

    // n must be odd at this point. So we can
    // skip one element (Note i = i +2)
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      // While i divides n, print i and divide n
      while (n % i == 0) {
        System.out.print(i + " ");
        n /= i;
      }
    }

    // This condition is to handle the case when
    // n is a prime number greater than 2
    if (n > 2)
      System.out.print(n);
  }

  /**
   * Finds all prime factors of the input parameter and returns as Integer List
   * @param n
   * @return
   */
  public static List<Integer> getPrimeFactors(int n){
  //todo who wants this?
    return null;
  }

  /**
   * <p>Coded by @Yusuf</p>
   * Prints a coloured text to console
   * Resource: https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
   */
  public static void printColouredText(){
    // Declaring ANSI_RESET so that we can reset the color
    String ANSI_RESET = "\u001B[0m";

    // Declaring the color (YELLOW)
    String ANSI_YELLOW = "\u001B[33m";

    // Printing the text on console prior adding the desired color
    System.out.println(ANSI_YELLOW + "This text is yellow" + ANSI_RESET);
  }

  /**
   * <p>Coded by @Glen</p>
   * Just prints an emoji
   * Resource: http://dplatz.de/blog/2019/emojis-for-java-commandline.html
   */
  public static void printEmoji(){
    System.out.println("\uD83E\uDD8A");
  }

  /**
   * <p>Coded by @kicchi</p>
   * Removes extra spaces in the provided String parameter
   * Example input: " They are  too     kind    "
   * output: "They are too kind"
   * @param inputStr
   * @return
   */
  public static String removeExtraSpace(String inputStr){
    while (inputStr.contains("  ")){
      inputStr = inputStr.replace("  "," ");
    }
    return inputStr.trim();
  }

  /**
   * <p>Coded by @Yuliia and @Glenio and @Ekaterina and @Sebastian</p>
   * Opens the provided webSite on the System Default Internet Browser
   * @param webSiteUrl should be in format "http://www.google.com" or "https://www.google.com"
   * @throws URISyntaxException
   * @throws IOException
   */
  public static void openWebsite(String webSiteUrl) throws URISyntaxException, IOException {
    Desktop desk=Desktop.getDesktop();
    desk.browse(new URI(webSiteUrl));
  }

  /**
   * <p>Coded by @Nina @Yusuf @Sumeye @Mehmet</p>
   * Simply plays system beep sound one time
   */
  public static void playBeepSound(){
    Toolkit.getDefaultToolkit().beep();
  }

  /**
   *
   * Checks is the provided input Strings are Anagram of each other
   * An anagram of a string is another string that contains the same characters,
   * only the order of characters can be different. For example,
   * “abcd” and “dabc” are an anagram of each other.
   * @param firstWord
   * @param secondWord
   * @return
   */
  public static boolean areAnagram(String firstWord, String secondWord){
    //todo who wants this?
    return false;
  }

  /**
   * Waits 5 seconds between two println commands
   */
  public static void waitBetweenTwoPrints(){
    //todo who wants this?
  }

  /**
   * Returns only 0 or 1 randomly
   * @return
   */
  public static int getZeroOrOneRandomly(){
    //todo who wants this?
    return 0;
  }

  /**
   * Simply changes background clor of the console
   */
  public static void changeBackgroundOfTheConsole(){
    //todo who wants this?
  }

  /**
   * This method can print a basic welcome with name, city and state
   * Example 1:
   * Input:
   * sayHello(new String[]{"John", "Smith"}, "Phoenix", "Arizona")
   * Output: Hello, John Smith! Welcome to Phoenix, Arizona!
   *
   * Example 2:
   * Input:
   * sayHello(new String[]{"John"}, "Phoenix", "Arizona")
   * Output: Hello, John! Welcome to Phoenix, Arizona!
   *
   * Example 3:
   * Input:
   * sayHello(new String[]{"John", “Cem”, “Smith”}, "Phoenix", "Arizona")
   * Output: Hello, John Cem Smith! Welcome to Phoenix, Arizona!
   * @param name for the name of person
   * @param city for name of the city
   * @param state for name of the state
   */
  public static void sayHello(String[] name, String city, String state){
    String temp = "";

    for (String each : name) {
      temp += each + " ";
    }

    temp = temp.trim();

    System.out.println("Hello, " + temp +"! Welcome to "+city+", "+state+"!");
  }
}
