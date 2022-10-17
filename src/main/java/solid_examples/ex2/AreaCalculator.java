package solid_examples.ex2;

public class AreaCalculator {
  public Double calculateRectangleArea(Rectangle rectangle) {
    return rectangle.length * rectangle.width;
  }

  public Double calculateCircleArea(Circle circle){
    return (22 / 7) * circle.radius * circle.radius;
  }

  public Double calculatePentagonAres(Pentagon pentagon){
    return 0d;// area calculation logic
  }
}
