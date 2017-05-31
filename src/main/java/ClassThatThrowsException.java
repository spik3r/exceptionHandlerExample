/**
 * Created by kai-tait on 31/05/2017.
 */
public class ClassThatThrowsException {
    
    ClassThatThrowsException() {
//        throw new BoringException("Something boring blew up!");
//        throw new SuperAwesomeException("Something super awesome blew up!");
        throw new RuntimeException("I don't care what blew up!");
    }
}
