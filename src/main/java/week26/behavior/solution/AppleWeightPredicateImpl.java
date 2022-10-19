package week26.behavior.solution;

public class AppleWeightPredicateImpl implements ApplePredicate{
  @Override
  public boolean matchApple(Apple apple) {
    return apple.getWeight() > 150;
  }
}
