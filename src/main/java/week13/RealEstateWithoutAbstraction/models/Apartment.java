package week13.RealEstateWithoutAbstraction.models;

public class Apartment {
  private String name;
  private String shape;

  public Apartment(String name, String shape){
    this.name = name;
    this.shape = shape;
  }

  public String getName(){
    return name;
  }
}
