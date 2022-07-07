package week12.Yusuf;

class Lexus extends Car{


  public Lexus(String model, String color, int year, double price) {
    super(model, color, year, price);
  }

  @Override
  void start() {
    System.out.println("to start the " + getModel() + " press the brake and push the start button");
  }
}
