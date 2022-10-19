package week26.behavior.solution;

public class AppleTypePredicateImpl implements ApplePredicate{

  @Override
  public boolean matchApple(Apple apple) {
    return apple.getType() == Type.EMPIRE;
  }
}
