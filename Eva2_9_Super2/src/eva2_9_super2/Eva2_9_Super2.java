
package eva2_9_super2;

/*
 David
 */
public class Eva2_9_Super2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante("David","Martínez",18,"6565423");
        estu.imprimirDatos();
       
        //--------------------------------------------
        Docentes doc = new Docentes("Juan", "Perez", 34, "asjdas");
        System.out.println("");
        doc.imprimirDatos();

        //-----------------------------------------------------
        Proveedores prov = new Proveedores("Mario", "Bros", 41, "sd5f31s");
        System.out.println("");
        prov.imprimirDatos();
    }
    
}