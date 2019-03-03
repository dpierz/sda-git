public class NumberValidator {
    public static void validate(String liczba1) throws IllegalAccessException {
//plus jka sie okazuje jest istotny 
        if (!liczba1.trim().matches("\\d+")) //plus powodyuje, ze nie ma przew miedzy znakami
            throw new IllegalAccessException("To nie jest liczba.");


//        try {
//            Double.parseDouble(liczba1);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Wpisałeś nieprawidłową wartość.");
//        }
    }
}