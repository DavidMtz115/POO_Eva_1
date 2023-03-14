
package eva2_7_this;

/*
 David
 */
public class Eva2_7_This {

    public static void main(String[] args) {
        
        //this no es puede usar en un contexto estatico
    }
    public void imprimir(){
        //aqui también es visible this
    }
}

//this es una reefrencia a una instacia de la clase
//todos los objetos tiene this
//pueden usar this en cualquier clase
//this solo existe internamente dentro del objeto
class Persona{
    private String nombre;

    //--------------------------------------
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    //this.nombre es el atributo de la calse
    //nombre es la variable (parametro) decalrado en el metodo
    //----------------------------------
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void imprrimirDatos(){
        System.out.println("El nombre es: "+ this.nombre);
    }
 
}

