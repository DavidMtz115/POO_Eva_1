
package eva2_24_collections;

import java.util.ArrayList;

/*
 David
 */
public class Eva2_24_Collections {

    public static void main(String[] args) {
        
        ArrayList miArreglo = new ArrayList();
        miArreglo.add(new Persona());
        miArreglo.add(new Perro());
        miArreglo.add(new Automovil());
        
        ArrayList<Integer> miArreglo2 = new ArrayList<Integer>();//guardamos enteros
        miArreglo2.add(100);
        miArreglo2.add(200);
        miArreglo2.add(300);
        miArreglo2.add(400);
        System.out.println(miArreglo2);
    }
    
}

class Persona{
    
}

class Automovil{
    
}

class Perro{
    
}
