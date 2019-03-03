public class Operations {
    public static int giveAnswer(String znak, String liczba1, String liczba2) throws IllegalAccessException {

        switch (znak) {
            case "+":
                return Integer.valueOf(liczba1) + Integer.valueOf(liczba2);
            case "-":
                return Integer.valueOf(liczba1) - Integer.valueOf(liczba2);
            case "*":
                return Integer.valueOf(liczba1) * Integer.valueOf(liczba2);
            case "/":
                return Integer.valueOf(liczba1) / Integer.valueOf(liczba2);
            default:
                throw new IllegalAccessException();

        }
    }
}
