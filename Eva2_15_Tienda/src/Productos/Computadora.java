package Productos;

import SuperClases.Electronica;

/*
 David
 */
public final class Computadora extends Electronica {

    private double tamaño;
    private int memoria;
    private String procesador;
    private String dd;

    //-------------------------
    public Computadora() {
        super();
        this.tamaño = 0.0;
        this.memoria = 0;
        this.procesador = "-----";
        this.dd = "----";
    }

    public Computadora(double tamaño, int memoria, String procesador, String dd, String fabricante, String modelo, int garantia, double precio, String nombre, String unidad) {
        super(fabricante, modelo, garantia, precio, nombre, unidad);
        this.tamaño = tamaño;
        this.memoria = memoria;
        this.procesador = procesador;
        this.dd = dd;
    }

    public String toString(){
        String cade = "DATOS: \n" +
                      "Nombre: " + getNombre() + "\n" +
                      "Modelo: " + getModelo() + "\n" +
                      "Fabricante: " + getFabricante() + "\n" +
                      "Garantia: " + getGarantia() + "\n" +
                      "Unidad: " + getUnidad() + "\n" +
                      "Tamaño: " +getTamaño() + "\n" +
                      "Memoria: " +getMemoria() + "\n" + 
                      "Procesador:" +getProcesador() + "\n" +
                      "DD: " +getDd() + "\n" +
                      "Precio: " + precioVenta(10);
                      
        return cade;
    }

    //-----------------------------------
    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    @Override
    public double precioVenta(int cant) {
        //10 unidades --> el precio es del 80%
        if (cant < 10) {
            return precio * cant;
        } else {
            return (precio * 0.8) * 20;
        }
    }

}
//computadora es una clase finla:
//ya no se puede heredar de una clase final
/*class Laptop extends Computadora{
    
}*/
