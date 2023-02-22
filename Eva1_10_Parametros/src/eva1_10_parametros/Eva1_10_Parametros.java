
package eva1_10_parametros;

/*
 David
 */
public class Eva1_10_Parametros {

    public static void main(String[] args) {
       nPrintln("hello",5); 
    }
    public static void nPrintln(String mensaje, int n){
        for (int i = 0; i < n; i++){
            System.out.println(mensaje);
        }      
    }
}
