
package cinematicketreservationsystem;


public class MovieDoesNotExistException extends Exception {

    public MovieDoesNotExistException()
    {
        
    }
    
  public MovieDoesNotExistException(String message)
  {
      System.out.println(message);
  }
}
