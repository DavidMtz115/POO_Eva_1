
package eva2_17_interfaces;

/*
 David
 */
public abstract class Producto {
    
    protected double precio;
    protected String nombre;
    
    //---------------------------
    public Producto() {
        this.nombre = "-----";
        this.precio = 0.0;
    }
    public Producto(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }
    
    //---------------------------------------
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
}
