
package eva1_19_static;

/*
 David
 */
public class Eva1_19_Static {

    public static void main(String[] args) {
        
        System.out.println("Pi:" +Math.PI);
        System.out.println("Numero aleatorio: " + Math.random());
        Utilerias uti = new Utilerias();
        uti.Saludo();
        Utilerias.otroSaludo();
        Saludo2();/*Si no es estatico y no se ha creado
        un objeto el metodo no existe*/
    }
    public void Saludo2(){
        System.out.println("HOLA");
    }        
}

class Utilerias{
    /*Este meto existe hasta que se crea un objeto de la clase,
    solo se usa a travez de un objeto*/
    public void Saludo(){
        System.out.println("Hola!!");
    }
    /* otroSaludo(): este metodo existe en el momento que el 
    programador inicia su ejecucion. No necesita que se cree un 
    objeto de la clase para poder utilizarlo. Se usa a traves de la clase*/
    public static void otroSaludo(){
            System.out.println("Otro saludo(static)");
    }
}