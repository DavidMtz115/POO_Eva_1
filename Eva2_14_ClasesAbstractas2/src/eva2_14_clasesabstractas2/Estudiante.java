
package eva2_14_clasesabstractas2;

/*
 David
 */
public class Estudiante extends Persona{
    
    private String noControl;

    //---------------------------------------
    public Estudiante() {
        
    }
    public Estudiante(String noControl) {
        this.noControl = noControl;
    }

    //--------------------------------------
    public String getNoControl() {
        return noControl;
    }
    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    @Override
    public void imprimirDatos() {
    }
}
