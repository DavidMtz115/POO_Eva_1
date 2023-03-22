
package eva2_9_super2;

/*
 David
 */

//Clase derivada extends Clase Base
//SUbclase extends Superclase
//Hijo extends Padre
//Estudiante is-a persona
public class Estudiante extends Persona{
  
    private String noControl;
    
    //-------------------------------
    public Estudiante(){
        super();//llamada al constructor de la superclase
        this.noControl = "-------";
    }
    public Estudiante(String nombre, String apellido, int edad, String noControl){
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }
    
    //-----------------------------------------
    public String getNoControl() {
        return noControl;
    }
    public void setNoControl(String n_Control) {
        this.noControl = n_Control;
    }
    
    @Override//oculta el metodo (con la mismoa firma) en la siper clase
    //en este caso, remplaza a iprimirDatos() de perosona
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No de Control: "+ this.noControl);
    }
}
