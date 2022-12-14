package week32.algo;

public class DivNumberUntilOneDigitSolution {

  public static void main(String[] args) {
    System.out.println(digitalRoot(999));
  }

  public static int digitalRoot(int n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n = n / 10;
    }
    if (sum < 10) {
      return sum;
    }
    return digitalRoot(sum);
  }

}
