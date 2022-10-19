package week26.behavior.solution;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Apple {
  private Color color;
  private double weight;
  private Type type;
}
