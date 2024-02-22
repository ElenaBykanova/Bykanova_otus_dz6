package exceptions;

public class BrowserNotFoundException extends RuntimeException{
    public BrowserNotFoundException(String browserName){
        super(String.format("Browser $s not found",browserName));
    }
}
