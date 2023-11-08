
package cinematicketreservationsystem;


public class TicketPurchaseLimitException extends Exception {
public   TicketPurchaseLimitException()
    {
        
    }
    
  public   TicketPurchaseLimitException(String message)
  {
      System.out.println(message);
  }
}
