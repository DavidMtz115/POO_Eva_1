package eva3_7_throwexception;

import java.util.Scanner;


/*
 David
 */

public class Eva3_7_ThrowException {

    public static void main(String[] args) {

        Prueba obj = new Prueba();
        try {
            obj.capturaMayorCero(0);
            System.out.println("Introduce un valor");
            Scanner A = new Scanner(System.in);
            int valor = A.nextInt();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }        
        //aritmetic exception es "uncheked" y no es obligatorio capturar la excepcion
        try {
            obj.division(100, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Prueba {

    public void capturaMayorCero(int valor) throws Exception {
        if (valor <= 0)//voy a generar una excepcion
        {
            throw new Exception(valor + " es negativo, solo se aceptan positivos");
        }
        System.out.println("El valor es: " + valor);
    }
    public int division(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("El valor del divisor es cero, y es invalido");
        }
        return x = y;
    }
    
}
