package week12;

public class YusufCircle {

  public static void main(String[] args) {

    top();
    bottom();
  }

  private static void bottom(){
    for (int currentRadius = getRadius()-1, leftIndent = 0, radiusShortener=1; currentRadius >= 0; currentRadius-=radiusShortener,leftIndent+=radiusShortener,radiusShortener+=2) {
      System.out.println(" ".repeat(leftIndent) + "*" + " ".repeat(currentRadius*2) + "*");
    }
  }

  private static void top(){
    int radius = getRadius();
    for (int currentRadius = 0, leftIndent = radius - 1, radiusEnlarger=3 ; currentRadius <= radius; currentRadius+=radiusEnlarger,leftIndent-=radiusEnlarger,radiusEnlarger-=2) {
      System.out.println(" ".repeat(leftIndent) + "*" + " ".repeat(currentRadius*2) + "*");
    }
  }

  private static int getRadius(){
    return 10;
  }
}
