
package eva2_21_polimorfismo;

/*
 David
 */
public class Eva2_21_Polimorfismo {

    public static void main(String[] args) {
        
        Estudiante estu = new Estudiante("David", "Martínez", 18, "22550287");
        estu.imprimirDatos();
        
        Docentes doc = new Docentes("Martina", "Chavez", 22, "Tiempo Completo");
        doc.imprimirDatos();
        //pueo tratar a los ibjetos de las subclases como objetos de la superclase
        //no se puede al reves
        
        //estoy asignando un objeto de un tipo estudiante 
        //a un a variable de tipo persona
        Persona per = estu;
        //estoy generaliazando (simplificando)
        Persona per2 = doc;
        Persona per3 = new Persona();
        //es imposible convertir una persona en un estudiante
        //no podemos agregar cosas, simplemente ocultamos propiedades
        //Estudiante estu2 = per3;
    }
}
