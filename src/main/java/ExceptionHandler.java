public final class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    
    @Override
    public void uncaughtException(Thread thread, Throwable exception) {
        System.out.println();
        System.out.println("Exception name: " + exception.getClass().getName());
        System.out.println("Exception message: " + exception.getMessage());
        System.out.println("____");
        
        if (exception instanceof BoringException) {
            System.out.println("ERROR! caught a BoringException");
            throw new SuperAwesomeException(exception.getMessage());
        }
        if (exception instanceof SuperAwesomeException) {
            System.out.println("ERROR! caught a SuperAwesomeException");
            throw new BoringException(exception.getMessage());
        }
        else {
            System.out.println("ERROR! caught some other exception I don't really care about");
            System.out.println("Not doing anything");

        }
    }
}
