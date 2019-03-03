import javax.swing.*;
import java.util.Scanner;

public class InputManager {
    private static Scanner scanner = new Scanner(System.in); //dlatego statyczny,bo metoda get Operation jest statyczna

    public static String getOperation() {
        System.out.println("Podaj znak operacji matematycznej," + " którą chcesz wykonać +,-,*,/:");
       return scanner.next();

//        return JOptionPane.showInputDialog("Podaj znak operacji matematycznej, którą chcesz wykonać +,-,*,/:");//wyświetli się okienko, w które możemy wpisać znak operacji
//        new StringBuilder("").append("").toString();
    }

    public static String getNumber() {
        System.out.println("Podaj liczbę dla której chcesz wykonać operację:");
        return scanner.next();
    }

//    public static void main(String[] args) {
//        System.out.println(getOperation());
    }
