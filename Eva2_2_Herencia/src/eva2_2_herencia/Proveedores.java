
package eva2_2_herencia;

/**
 *
 * @author david
 */
public class Proveedores {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String razonSociall;
    private String rfc;

    //--------------------------------
    public Proveedores() {
    }
    public Proveedores(String nombre, String apellido, int edad, String razonSociall, String rfc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.razonSociall = razonSociall;
        this.rfc = rfc;
    }
    
    //-------------------------------------
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

    public String getRazonSociall() {
        return razonSociall;
    }

    public void setRazonSociall(String razonSociall) {
        this.razonSociall = razonSociall;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
        
}
