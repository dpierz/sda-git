public class KalkulatorApp {
    public static void main(String[] args) {
        String działanie = InputManager.getOperation();
        try {
            OperationValidator.validate(działanie); //todo obsługa wyjatku
        }catch (IllegalAccessException e){
            e.printStackTrace();
            działanie = InputManager.getOperation();
        }


        String liczba1 = InputManager.getNumber(); //todo obsługa wyjatku
        //NumberValidator.validate(liczba1);

        String liczba2 = InputManager.getNumber(); //todo obsługa wyjatku
        //umberValidator.validate(liczba2);

        try {
            System.out.println(Operations.giveAnswer(działanie, liczba1, liczba2)); //todo obsługa wyjatku... czy napewno?
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
