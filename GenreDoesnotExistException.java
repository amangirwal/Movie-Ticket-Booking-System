
package cinematicketreservationsystem;


public class GenreDoesnotExistException extends Exception {

    public GenreDoesnotExistException()
    {
        
    }
    
  public GenreDoesnotExistException(String message)
  {
      System.out.println(message);
  }
    
}
