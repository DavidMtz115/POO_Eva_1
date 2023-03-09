
package eva2_2_herencia;

/*
 David
 */
public class Estudiante {
  
    private String nombre;
    private String apellido;
    private int edad;
    private int n_control;

    //--------------------------------------------
    public Estudiante() {
    }
    public Estudiante(String nombre, String apellido, int edad, int n_control) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.n_control = n_control;
    } 
    
    //---------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getN_control() {
        return n_control;
    }

    public void setN_control(int n_control) {
        this.n_control = n_control;
    }
    
    
}
