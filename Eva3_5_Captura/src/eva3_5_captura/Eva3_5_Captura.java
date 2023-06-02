
package eva3_5_captura;

import java.util.Scanner;
import java.util.InputMismatchException;

/*
 David
 */

public class Eva3_5_Captura {

    public static void main(String[] args) {
        
        int x;
        do{
            try{
            Scanner A = new Scanner (System.in);
            System.out.println("Introdice el valor (entero)");
            x = A.nextInt();
            break;
            }catch(InputMismatchException e){
                System.out.println("No se introdujo un numero valido, vuelve a capturar");
            }
        }while(true);
        System.out.println("Valor de X = " + x);
    }
    
}
