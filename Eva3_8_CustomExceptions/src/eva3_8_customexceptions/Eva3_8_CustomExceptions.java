package eva3_8_customexceptions;

import java.util.Set;

/*
 David
 */

public class Eva3_8_CustomExceptions {

    public static void main(String[] args) {
        
        Persona per  = new Persona("David", "Martínez", -8);
        per.setNombre("David");
        per.setApellido("Martínez");
        
      /*  try{
            per.setEdad(-8);
        }catch(DatoEntradaException e){
            System.out.println(e.getMessage());
        }*/
    }
    
}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "------";
        this.apellido = "------";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
    }
    
    //--------------------------------------------
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
    public void setEdad(int edad) /*throws DatoEntradaCheckedEx*/ {
        if(edad < 0)
           throw new DatoEntradaException();   //     Unchecked
         //   throw new DatoEntradaCheckedEx();
        this.edad = edad;
    }
    
}

class DatoEntradaException extends RuntimeException{

    public DatoEntradaException() {
        super("Dato de entrada incorrecto!! El valor debe ser positivo");
    }  
       
}

class DatoEntradaCheckedEx extends Exception{

    public DatoEntradaCheckedEx() {
        super("Dato de entrada incorrecto!! El valor debe ser positivo");
    }
    
}
