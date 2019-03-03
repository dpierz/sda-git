public class Operations {
    public static int giveAnswer(String działanie, Integer liczba1, Integer liczba2) {

        switch (działanie) {
            case "+":
                return (liczba1 + liczba2);
            case "-":
                return (liczba1 - liczba2);
            case "*":
                return (liczba1 * liczba2);
            case "/":
                if (liczba2 == 0) {
                    System.out.println("Nie dziel cholero przez zero.");
                } else {
                    return (liczba1 / liczba2);
                }
        }
        return 000000;
    }
}
