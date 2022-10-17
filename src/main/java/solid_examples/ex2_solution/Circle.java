package solid_examples.ex2_solution;

public class Circle implements ShapeActions {
  public Double radius;

  @Override
  public Double calculateArea() {
    return (22 / 7) * radius * radius;
  }
}
