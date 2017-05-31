/**
 * Created by kai-tait on 31/05/2017.
 */
public class BoringException extends RuntimeException {
    
    final String message;
    
    BoringException(String message) {
        super(message);
        this.message = message;
    }
}
