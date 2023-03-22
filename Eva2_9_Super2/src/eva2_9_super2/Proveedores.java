
package eva2_9_super2;

/*
 David
 */

//Proveedores is-a persona
public class Proveedores extends Persona{
    
    private String rfc;

    //--------------------------
    public Proveedores(){
        super();
        this.rfc = "--------";
    }
    public Proveedores(String nombre, String apellido, int edad, String rfc){
        super(nombre, apellido, edad);
        this.rfc = rfc;
    }
    //-------------------------------
    public String getRfc() {
        return rfc;
    }
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("RFC: "+ this.rfc);
    }
}
