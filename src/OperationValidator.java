import java.util.regex.Pattern;

public class OperationValidator {
    public static void validate(String działanie) throws IllegalAccessException {
        //sprawdzamy czy długosc stringa jest 1 lub mniejsza
        //przewidujemy tylko pojetynczy znak!
        //[+-/*]
        if (działanie.trim().length() >1 &&
                //sprawdzamy  czy znak jest znakiem operacji
                !działanie.trim().matches("[+-/*]/g"))
            //jeżeli warunek jest spełniony rzucamy wyjątkiem
            throw new UnsupportedOperationException(
                    "To nie jest znak działania matematycznego!");

    }
}
