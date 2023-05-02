
package eva2_19_interfaces_figuras;

import eva2_22_polimorfismofiguras.Triangulo;
import eva2_22_polimorfismofiguras.Circulo;

/*
 David
 */
public class Eva2_19_Interfaces_Figuras {

    public static void main(String[] args) {
        
        //no se pueden crear instancias de las interfaces
        //Figuras fig = new  Figuras();
        //MostrarDatos mos = new MostrarDatos();
        
        Triangulo tri = new Triangulo(20,20);
        tri.imprimirDatos();
        
        Circulo cir = new Circulo(20);
        System.out.println("");
        cir.imprimirDatos();
    }
    
}
