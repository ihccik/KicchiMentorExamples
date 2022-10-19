package week26.behavior.problem;

import java.util.List;
import java.util.stream.Collectors;

public class Inventory {

  private RepositoryService repositoryService;

  public List<Apple> getGreenApples() {
    return repositoryService.getAllApples().stream()
        .filter(apple -> apple.getColor() == Color.GREEN).collect(
            Collectors.toList());
  }

  public List<Apple> getGreenApplesHeavierThan150() {
    return repositoryService.getAllApples().stream().filter(apple -> apple.getWeight() > 150d)
        .collect(
            Collectors.toList());
  }

  public List<Apple> getGreenApplesHeavierThan180RedAndGolden() {
    return repositoryService.getAllApples().stream().filter(
        apple -> apple.getWeight() > 180d && apple.getColor() == Color.RED
            && apple.getType() == Type.GOLDEN).collect(
        Collectors.toList());
  }
}
