
package MisClases;

/*
 David
 */
public class Persona {
    
    private String nombre;
    private int ID, edad;
    
    //---------------------------------
    public void setNombre(String valor){
        nombre = valor;
    }
    public void setID(int valor){
        ID = valor;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    public String getNombre(){
        return nombre;
    }
    public int getID(){
        return ID;
    }
    public int getEdad(){
        return edad;
    }
    
    //-----------------------------------------
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("ID: "+ID);
        System.out.println("Edad: "+edad);
    }
    
}
