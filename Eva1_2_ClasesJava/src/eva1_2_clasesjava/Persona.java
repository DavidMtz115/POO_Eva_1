
package eva1_2_clasesjava;

/*
 David
 */
public class Persona {
  //Atributos de la clase
   private String nombre, apellido;
   private int edad;
   private boolean estadoCivil;
   //Metodos get> leer, set> escribir
   //Metodos: modificador, valor de retorno, nombre(argumento)(implementacion)
   public String getNombre(){
       return nombre;
   }
   public void setNombre(String valor){
       nombre = valor;
   }
   public String getApellido(){
       return apellido;
   }    
    public void setApellido(String valor){
       apellido = valor;
   }
    public int getEdad(){
       return edad;
    }
     public void setEdad(int valor){
       edad = valor;
   }
     public boolean getEstadoCivil(){
       return estadoCivil;
     }
      public void setEstadoCivil(boolean  valor){
       estadoCivil = valor;
   }
      public void imprimirDatos(){
          System.out.println("Datos almacenados:");
          //"+" = concatenación o sumar numeros (sobrecarga de operadores)
          System.out.println("Nombre completo: "+nombre+" "+apellido);
          System.out.println("Edad: "+edad);
          if (estadoCivil)
              System.out.println("Estado civil: Casado");
          else
              System.out.println("Estado civil: Soltero");
          
      }
}
