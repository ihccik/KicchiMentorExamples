package week13.amazon_product;

import java.util.ArrayList;

public class Product {
  private long id;
  private String name;
  private int currentDiscountPercentage;
  private double listPrice;
  private String brand;
  private Model model;
  private ArrayList<Image> images;
  public double getDiscountedPrice(){
    return (listPrice/(double)100) * (double)currentDiscountPercentage;
  }
}

class CameraPhoto extends Product{
  private FocusType focusType;
  private int objectiveLensDiameter;
  private int batteryCount;
  private BatteryType batteryType;
  private double weight;
  public String getBatteryInfo(){
    return batteryCount + batteryType.toString() + " required";
  }
}

class BinocularScope extends CameraPhoto{
  private FinderScopeType finderScopeType;
}

class Telescope extends BinocularScope{
  private TelescopeMountType mountType;
}

class Reflector extends Telescope{
  private int voltage;
}