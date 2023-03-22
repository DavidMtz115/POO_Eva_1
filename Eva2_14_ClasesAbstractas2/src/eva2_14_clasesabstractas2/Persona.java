
package eva2_14_clasesabstractas2;

/*
 David
 */
public abstract class Persona {
    
    private String nombre;
    private int edad;
    
    //-------------------------
    public Persona() {
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //-----------------------------------------
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Los metodos abstractos pueden coexistir con metodos normales
    public abstract void imprimirDatos();
}
