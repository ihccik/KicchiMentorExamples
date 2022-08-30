package yusuf_fight_game;

public enum EColor {

  RED("\u001B[1;91m"),
  LIGHT_RED("\u001B[31m"),
  BLUE("\u001B[1;34m"),
  LIGHT_BLUE("\u001B[94m"),
  GREEN("\u001B[32m"),
  LIGHT_GREEN("\u001B[1;92m"),
  LIGHT_GREEN_Italic("\u001B[3;92m"),
  YELLOW("\u001B[33m"),
  LIGHT_YELLOW("\u001B[1;93m"),
  BLACK("\u001B[30m"),
  PURPLE("\u001B[35m"),
  LIGHT_PURPLE("\u001B[95m"),
  CYAN("\u001B[36m"),
  LIGHT_CYAN("\u001B[96m"),
  WHITE("\u001B[1;37m"),
  LIGHT_WHITE("\u001B[1;97m"),
  CrossOut("\u001B[9m"),
  BackG_Contrast("\u001B[7m"),
  Underline("\u001B[4m"),
  BOLD_Underline("\u001B[4m"),
  Surround("\u001B[51m"),
  BOLD("\u001B[1m"),
  ITALIC("\u001B[3m"),
  BackG_RED("\u001B[101m"),
  BackG_Light_Color_RED("\u001B[101m"),
  BLACK_UNDERLINED("\u001B[4;30m"),
  RED_UNDERLINED("\u001B[4;31m"),
  GREEN_UNDERLINED("\u001B[4;32m"),
  LIGHT_GREEN_UNDERLINED("\u001B[4;3;1;92m"),
  YELLOW_UNDERLINED("\u001B[4;33m"),
  BLUE_UNDERLINED("\u001B[4;34m"),
  PURPLE_UNDERLINED("\u001B[4;35m"),
  CYAN_UNDERLINED("\u001B[4;36m");


  final String colorValue;
  EColor(String colorValue){
    this.colorValue = colorValue;
  }

}
