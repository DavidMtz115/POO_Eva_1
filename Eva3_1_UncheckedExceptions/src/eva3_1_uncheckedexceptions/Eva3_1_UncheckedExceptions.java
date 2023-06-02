
package eva3_1_uncheckedexceptions;

import java.util.Scanner;

/*
 *David
 */

public class Eva3_1_UncheckedExceptions {

    public static void main(String[] args) {
        
        //Aritmetic Exception - division entr cero
        System.out.println("INICIANDO EL PROGRAMA");
        int x = 5, y = 0;
        System.out.println("INICIALIZANDO LAS VARIABLES");
        int resu = x / y;
        System.out.println("CALCULANDO LA DIVISIÓN");
        System.out.println("Division = "+ resu);
        
        //InputMismatchException
        Scanner A = new Scanner (System.in);
        System.out.println("Introduce un número");
        int num = A.nextInt();
        System.out.println("Tu número es: " +num);
        
        //Indexoutofbounds exception
        int[] arreglo = new int [5];//0 - (N - 1)
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;
        
        //Nullpointer exception
        Prueba objPrueba = null;
        System.out.println("Valor de x = " + objPrueba.x);
    }
    
}

class Prueba{
    public int x;
}