/**
 * Created by kai-tait on 31/05/2017.
 */
public class SuperAwesomeException extends RuntimeException {
    
    final String message;
    
    SuperAwesomeException(String message) {
        super(message);
        this.message = message;
    }
}
