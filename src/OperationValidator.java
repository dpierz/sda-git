import java.util.regex.Pattern;

public class OperationValidator {
    public static void validate(String działanie) {
        //[+-/*]
        //sprawdzamy czy długość stringa jest 1 lub mniejsza
        //przewidujemy że jest to mniejszy znak
        if (działanie.trim().length() > 1 &&
                //sprawdzamy czy znak jest znakiem operacji
                !działanie.trim().matches("[+-/*]/g")) {
            //wyjątek jak warunek spełniony
            throw new UnsupportedOperationException(
                    "To nie jest znak działania matematycznego!");
        }
    }
}