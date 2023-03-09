
package eva2_3_extends;

/*
 David
 */
public class Eva2_3_Extends {

    public static void main(String[] args) {
        Estudiante estu = new Estudiante();
        estu.setNombre("Juan");
        estu.setApellido("Perez");
        estu.setEdad(20);
        estu.setNoControl("22550287");
        
        System.out.println("IMPRIMIR DATOS");
        System.out.println("Nombre: "+estu.getNombre());
        System.out.println("Apellido: "+estu.getApellido());
        System.out.println("Edad: "+estu.getEdad());
        System.out.println("Numero de control: "+estu.getNoControl());
        
        //-----------------------------------------------
        Proveedores pro = new Proveedores();
        pro.setNombre("awjkdn");
        pro.setApellido("askjdas");
        pro.setEdad(56);
        pro.setRfc("qsdasd");
        
        System.out.println("");
        System.out.println("IMPRIMIR DATOS");
        System.out.println("Nombre: "+pro.getNombre());
        System.out.println("Apellido: "+pro.getApellido());
        System.out.println("Edad: "+pro.getEdad());
        System.out.println("RFC: "+pro.getRfc());
    }
    
}
