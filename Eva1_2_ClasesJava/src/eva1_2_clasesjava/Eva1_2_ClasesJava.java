
package eva1_2_clasesjava;

/*
 David
 */
public class Eva1_2_ClasesJava {

    public static void main(String[] args) {
        Persona per1 = new Persona();//asignar memoria con new,, Invocar su constructor
       /* 
        per1.nombre = "David";
        per1.apellido = "Martínez";
        per1.edad = 18;
        per1.estadoCivil = false; //false es soltero
       */
       per1.setNombre("David");
       per1.setApellido("Martínez");
       per1.setEdad(18);
       per1.setEstadoCivil(false);
       per1.imprimirDatos();
     
       //Persona 2
       Persona per2 = new Persona ();
       per2.setNombre("Jorge");
       per2.setApellido("Martínez");
       per2.setEdad(20);
       per2.setEstadoCivil(false);
       per2.imprimirDatos();
    }
}
