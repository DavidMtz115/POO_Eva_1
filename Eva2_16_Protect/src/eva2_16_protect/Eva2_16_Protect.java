
package eva2_16_protect;

/*
 David
 */
public class Eva2_16_Protect {

    public static void main(String[] args) {
        // TODO code application logic here
        SuperClase sup = new  SuperClase();
        sup.dato = 100;
    }
    
}

class SuperClase{
    protected int dato;
}

class SubClase extends SuperClase{
    public void imprimirDato(){
        System.out.println("El valor de datos es: " + dato);
    }
}