package eva3_4_multiplesexcepciones;

import java.util.Scanner;
import java.util.InputMismatchException;

/*
 David
 */
public class Eva3_4_MultiplesExcepciones {

    public static void main(String[] args) {

        int x, y;
        Scanner A = new Scanner(System.in);
        do {
            try {
                System.out.println("Introduce el valor (entero) de X:");
                x = A.nextInt();
                System.out.println("Introduce el valor (entero) de Y:");
                y = A.nextInt();
                int resu = x / y;
                System.out.println("La division de " + x + "/" + y + "es: " + resu);
                break;
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre cero: " + e.getMessage());
            } catch (InputMismatchException a) {
                System.out.println("La captura es incorrecta: " + a.getMessage());
            }
        } while (true);
        System.out.println("PROGRAMA TERMIDAO CON EXITO");
    }

}
