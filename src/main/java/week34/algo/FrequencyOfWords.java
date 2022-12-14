package week34.algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfWords {

  public static void main(String[] args) {
    String rhyme = "A sailor went to knee, knee, knee\n"
        + "To see what he could knee, knee, knee\n"
        + "But all that he could knee, knee, knee\n"
        + "Was the bottom of the deep blue knee, knee, knee!\n"
        + "Sea, sea, sea";
    System.out.println(getFreqOFWords(rhyme));
    System.out.println(getFreqOFWords2(rhyme));
  }

  public static Map<String, Integer> getFreqOFWords(String str) {

    str = str.toLowerCase(Locale.ROOT);
    str = str.replaceAll("\\p{P}", "");// replace all punctuations

    Map<String, Integer> mapOfWords = new HashMap<>();

    for (String s : str.split("\\W+")) {
      s = s.trim();
      if (mapOfWords.containsKey(s)) {
        mapOfWords.put(s, mapOfWords.get(s) + 1);
      } else {
        mapOfWords.put(s, 1);
      }
    }
    return mapOfWords;
  }

  public static Map<String, Long> getFreqOFWords2(String str) {
    return Arrays
        .stream(str.toLowerCase(Locale.ROOT).trim()
            .split("\\W+"))
        .collect(Collectors
            .groupingBy(String::valueOf, Collectors.counting()));
  }
}
