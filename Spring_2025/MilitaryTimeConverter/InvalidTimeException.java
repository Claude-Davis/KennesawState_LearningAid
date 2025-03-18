package MilitaryTimeConverter;

//this class is a subclass of the class "Exception"
public class InvalidTimeException extends Exception{
    InvalidTimeException (String x){
        super(x);
    }
}