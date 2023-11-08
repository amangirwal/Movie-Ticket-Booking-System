
package cinematicketreservationsystem;


public class InvalidPhoneNumberException extends Exception {
 public InvalidPhoneNumberException()
    {
        
    }
    
    public InvalidPhoneNumberException(String message)
    {
        System.out.println(message);
    }
}
