
package eva2_21_polimorfismo;

/*
 David
 */
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
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No de Control: "+ this.noControl);
    }
}
