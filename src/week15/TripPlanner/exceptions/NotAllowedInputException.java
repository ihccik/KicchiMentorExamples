package week15.TripPlanner.exceptions;

public class NotAllowedInputException extends RuntimeException{
  public NotAllowedInputException(String message){
    super(message);
  }
}
