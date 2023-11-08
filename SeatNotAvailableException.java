
package cinematicketreservationsystem;


public class SeatNotAvailableException extends Exception {
 
    public   SeatNotAvailableException()
    {
        
    }
    
  public   SeatNotAvailableException(String message)
  {
      System.out.println(message);
  }
}
