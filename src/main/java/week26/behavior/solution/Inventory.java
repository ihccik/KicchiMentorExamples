package week26.behavior.solution;

import java.util.List;
import java.util.stream.Collectors;

public class Inventory {

  private static RepositoryService repositoryService = () -> {
    return List.of(Apple.builder().type(Type.FUJI).color(Color.RED).weight(102d).build());
  };

  public static List<Apple> filterApples(List<Apple> apples, ApplePredicate applePredicate){
    return apples.stream().filter(apple ->
        applePredicate.matchApple(apple)
    ).collect(Collectors.toList());
  }

  public static void main(String[] args) {
    //filterApples(repositoryService.getAllApples(), new AppleColorPredicateImpl());
    //filterApples(repositoryService.getAllApples(), new AppleWeightPredicateImpl());

    /*
    filterApples(repositoryService.getAllApples(), apple -> {
      return apple.getType() == Type.FUJI
          && apple.getWeight() > 200
            && apple.getColor() == Color.GREEN;
    });*/


    PredicateExtender predicateExtender = apple -> apple.getColor() == Color.GREEN;

    System.out.println(predicateExtender.test(Apple.builder().type(Type.FUJI).color(Color.GREEN).weight(102d).build()));
  }
}
