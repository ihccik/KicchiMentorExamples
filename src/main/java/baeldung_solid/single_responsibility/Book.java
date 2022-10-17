package baeldung_solid.single_responsibility;

public class Book {
  private String name;
  private String author;
  private String text;

  // methods that directly relate to the book properties
  public String replaceWordInText(String word, String replacementWord){
    return text.replaceAll(word, replacementWord);
  }

  public boolean isWordInText(String word){
    return text.contains(word);
  }

  //irrelevant operation with the purpose of the class
  //take this method to another meaningful class like BookPrinter
  void printTextToConsole(){
    // our code for formatting and printing the text
  }
}
