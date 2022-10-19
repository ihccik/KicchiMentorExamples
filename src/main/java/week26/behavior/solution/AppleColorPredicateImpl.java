package week26.behavior.solution;

public class AppleColorPredicateImpl implements ApplePredicate {

  @Override
  public boolean matchApple(Apple apple) {
    return apple.getColor() == Color.GREEN;
  }
}
