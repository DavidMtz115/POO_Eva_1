
package eva2_10_override;

/*
 David
 */
public class Eva2_10_OverRide {

    public static void main(String[] args) {
        // TODO code application logic here
        Persona per = new Persona();
        Persona per2 = new Persona("David", 18);
        System.out.println(per);
        System.out.println("");
        System.out.println(per2);
    }  
}

class Persona{
    private String nombre;
    private int edad;
    
    //-----------------------------
    public Persona() {
        this.nombre = "----";
        this.edad = 0;
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        //no estamos invocando al metodo sobreescreto de la super clase 
        //aqui estamos remplazando totalmente a toStering de la superclase
        String cade = "DATOS: \n" +
                      "Nombre: " + nombre + "\n" + 
                      "Edad: " + edad;
        return cade;
    }
    
    //------------------------------------------------
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
    
}