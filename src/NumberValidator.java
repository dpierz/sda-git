public class NumberValidator {
    public static void validate(String liczba1) {
        try {
            Double.parseDouble(liczba1);
        } catch (IllegalArgumentException e) {
            System.out.println("Nie wpisałaś/eś liczby.");
        }
    }
}