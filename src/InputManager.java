//import javax.swing.*;
import java.util.Scanner;

public class InputManager {
  private static  Scanner scanner = new Scanner(System.in);
    //powołaj nowy obiekt typu skaner
    // System.in - system input
    public static String getOperation() {
        System.out.println("podaj znak operacji");
        return scanner.next();
 //  return  JOptionPane.showInputDialog("podaj znak operacji"); //opcja z okienkiem

    }

    public static String getNumber() {

        System.out.println("Podaj pierwszą liczbę: ");
        return scanner.next();

    }

    }
