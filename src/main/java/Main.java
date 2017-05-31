/**
 * Created by kai-tait on 31/05/2017.
 */
public class Main {
    public static void main(String[] args)
    {
        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler());
        ClassThatThrowsException classThatThrowsException = new ClassThatThrowsException();
    }
}
