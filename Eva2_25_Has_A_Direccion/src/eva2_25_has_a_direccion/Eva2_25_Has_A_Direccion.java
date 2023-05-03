
package eva2_25_has_a_direccion;

/*
 David
 */
public class Eva2_25_Has_A_Direccion {

    public static void main(String[] args) {
        
        Direccion dir = new Direccion("Industrias", 11101, "Complejo industrial Chih", "31035", "Chihuahua", "Chihuahua");
        
        Persona per = new Persona();
        per.setNombre("David");
        per.setApellido("Martínez");
        per.setEdad(18);
        per.setDireccion(dir);
        per.imprimirDatos();
    }
}
class Direccion{
    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;
    
    //----------------------------
    public Direccion() {
        this.calle = "----";
        this.numero = 0;
        this.cp = "----";
        this.ciudad = "----";
        this.estado = "----";
    }
    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }
    
    //-----------------------------------------------
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getColonia() {
        return colonia;
    }
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public String getCp() {
        return cp;
    }
    public void setCp(String cp) {
        this.cp = cp;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
   
    public void imprimirDatos(){
        System.out.println("DIRECCIÓN:");
        System.out.println(calle + " #" + numero + ", " +
                           colonia + "\n C.P: " + cp +", " + ciudad +
                           ", " + estado);
    }
}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;//Persona has a (tienen una ) direccion
    
    //---------------------------------
    public Persona() {
        this.nombre = "----";
        this.apellido = "----";
        this.edad = 0;
        this.direccion = null;//no existe un objeto direccion
    }
    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    //---------------------------------------------
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApeliido() {
        return apellido;
    }
    public void setApellido(String apeliido) {
        this.apellido = apeliido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public void imprimirDatos(){
        System.out.println("PERSONA:");
        System.out.println("Nombre: "+ nombre + "\n" +
                           "Apellido: "+ apellido +"\n" +
                           "Edad: "+ edad +" años");
        System.out.println("");
        if (direccion == null)
            System.out.println("Sin direccion");
        else
            direccion.imprimirDatos();
    }
}

class Sucursal{
    private String nombreSucursal;
    private Direccion direccion;
}
