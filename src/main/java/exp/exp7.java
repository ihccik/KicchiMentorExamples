package exp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class exp7 {

  public static void main(String[] args) {
    int[] array = {34,59,19};

    Arrays.stream(array).forEach(e -> System.out.println(e));
  }
}
