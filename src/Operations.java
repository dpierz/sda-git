public class Operations {
    public static int giveAnswer(String działanie, String liczba1, String liczba2) {

        switch (działanie) {
            case "+":
                return (Integer.valueOf(liczba1) + Integer.valueOf(liczba2));
            case "-":
                return (Integer.valueOf(liczba1) - Integer.valueOf(liczba2));
            case "*":
                return (Integer.valueOf(liczba1) * Integer.valueOf(liczba2));
            case "/":
                    return (Integer.valueOf(liczba1) + Integer.valueOf(liczba2));
            default:
                throw new IllegalArgumentException();
                }
        }
    }

