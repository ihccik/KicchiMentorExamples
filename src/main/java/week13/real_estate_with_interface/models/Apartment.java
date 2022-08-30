package week13.real_estate_with_interface.models;

public abstract class Apartment {
  private String name;
  private String shape;

  protected Apartment(String name, String shape){
    this.name = name;
    this.shape = shape;
  }

  public String getName(){
    return name;
  }

  public String getShape(){
    return shape;
  }
}
