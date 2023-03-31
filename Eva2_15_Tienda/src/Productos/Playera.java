
package Productos;

import SuperClases.Ropa;

/*
 David
 */
public class Playera extends Ropa{
    
    private String talla;
    private String tipo;
    
    //------------------------------------
    public Playera() {
        super();
        this.talla = "------";
        this.tipo = "------";
    }
    public Playera(String talla, String tipo, String marca, String color, double precio, String nombre, String unidad) {
        super(marca, color, precio, nombre, unidad);
        this.talla = talla;
        this.tipo = tipo;
    }
        public String toString(){
        String cade = "DATOS: \n" +
                      "Nombre: " +getNombre() + "\n" +
                      "Unidad: " +getUnidad() + "\n" +
                      "Marca: " +getUnidad() + "\n" +
                      "Color: " +getColor() + "\n" +
                      "Talla: " +getTalla() + "\n" +
                      "Tipo: " +getTipo() + "\n" +
                      "Precio: " + precioVenta(10);
                      
        return cade;
    }
        
    //-----------------------------------------------
    public String getTalla() {
        return talla;
    }
    public void setTalla(String talla) {
        this.talla = talla;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }   
    
    @Override
     public double precioVenta(int cant){
         if (cant < 10)
            return precio * cant;
        else
            return (precio* 0.8) * 20;
     }
}
