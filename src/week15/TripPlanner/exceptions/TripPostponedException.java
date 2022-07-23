package week15.TripPlanner.exceptions;

import week15.TripPlanner.Constants;

public class TripPostponedException extends RuntimeException{
  public TripPostponedException(){
    super(Constants.TRIP_POSTPONED_MESSAGE);
  }
}
