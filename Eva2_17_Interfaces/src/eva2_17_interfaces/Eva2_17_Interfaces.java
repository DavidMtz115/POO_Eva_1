
package eva2_17_interfaces;

/*
 * @author david
 */
public class Eva2_17_Interfaces {

    public static void main(String[] args) {
        // TODO code application logic here
        Persona per = new Persona("David",18);
        per.imprimirDatos();
        
        Computadora com = new Computadora("Intel i7", 12, 25000, "Computadora");
        System.out.println("");
        com.imprimirDatos();
    }
    
}
