
package eva2_3_extends;

/*
 David
 */

//Clase derivada extends Clase Base
//SUbclase extends Superclase
//Hijo extends Padre
//Estudiante is-a persona
public class Estudiante extends Persona{
  
    private String noControl;
    
    //-----------------------------------------
    public String getNoControl() {
        return noControl;
    }
    public void setNoControl(String n_Control) {
        this.noControl = n_Control;
    }
    
}
