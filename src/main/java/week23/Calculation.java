package week23;

public class Calculation {

  public static void main(String[] args) {
    int m = addTriplet(3, 5, 2);
    System.out.println(m);
  }

  private static int add(int x, int y){
    return x + y;
  }

  private static int addTriplet(int x, int y, int z){
    return add(x, y) + z;
  }
}
