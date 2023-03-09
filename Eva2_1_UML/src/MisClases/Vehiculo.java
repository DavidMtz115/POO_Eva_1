
package MisClases;

/*
 David
 */
public class Vehiculo {
    
    private String marca,modelo;
    private int año;
    
    //-------------------------------------
    public void setMarca(String valor){
        marca = valor;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    public void setAño(int valor){
        año = valor;
    }
    public String getMarca(){
        return marca;
    }
    public String getMpdelo(){
        return modelo;
    }
    public int getAño(){
        return año;
    }
   
    //-------------------------------------------
    public void imprimirDatos(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año: "+año);
    }
}
