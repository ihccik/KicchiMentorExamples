package week14;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class DogsAsCollection {

  public static void main(String[] args) {
    Map<String, Object> car1 = new Hashtable<>();
    car1.put("brand", "Mitsubishi");
    car1.put("model", "Lancer Evolution IX");
    car1.put("color", "Black");
    car1.put("year", 2007);
    car1.put("price", 40_000);
    car1.put("electric", false);

    Map<String, Object> car2 = new Hashtable<>();
    car2.put("brand", "Toyota");
    car2.put("model", "Corolla");
    car2.put("color", "Black");
    car2.put("year", 2007);
    car2.put("price", 40_000);
    car2.put("electric", false);

    List<Map<String, Object>> cars = new ArrayList<>();
    cars.add(car1);
    cars.add(car2);

    ArrayList<Integer> prices = new ArrayList<>();

    cars.forEach(c -> prices.add((Integer) c.get("price")));

    System.out.println(prices);
  }
}
