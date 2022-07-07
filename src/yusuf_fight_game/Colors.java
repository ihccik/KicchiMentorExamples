package yusuf_fight_game;

public class Colors {
  public static void main(String[] args) {

  }
  /**
   * This method can print text with color.
   * @param color
   * @param text
   * @return
   */
  public static String color(EColor color , String text){
    final String ANSI_RESET = "\u001B[0m";
    return color.colorValue + text + ANSI_RESET;
  }


}
