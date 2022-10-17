package solid_examples.ex2_solution;

public class Rectangle implements ShapeActions{
  Double length;
  Double width;

  @Override
  public Double calculateArea() {
    return length * width;
  }
}
