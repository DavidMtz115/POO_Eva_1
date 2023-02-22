
package eva1_8_llamada_funcion;

/*
 David
 */
public class Eva1_8_Llamada_Funcion {

    public static void main(String[] args) {
        
        System.out.println("Inicia main()");
        A();//llamada a funcion
        System.out.println("Termina main()");
    }
    public static void A(){
        System.out.println("Inicia A()");
        B();//llamada a funcion
        System.out.println("Termina A()");       
    }
    public static void B(){
        System.out.println("Inicia B()");
        System.out.println("Termina B()");
    }
}
