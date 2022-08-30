package week15.TripPlanner.modals;

public class City {
  private String name;
  private byte xCoordinate;
  private byte yCoordinate;

  public City(String name, byte xCoordinate, byte yCoordinate){
    this.name = name;
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
  }

  public String getName() {
    return name;
  }

  public int getDistance(City target){
    return (target.yCoordinate - yCoordinate) + (target.xCoordinate - xCoordinate);
  }
}
