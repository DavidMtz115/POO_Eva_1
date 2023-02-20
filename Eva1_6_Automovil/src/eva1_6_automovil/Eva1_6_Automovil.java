
package eva1_6_automovil;

/*
 David
 */
public class Eva1_6_Automovil {

    public static void main(String[] args) {
        Carro car1 = new Carro();
        
        car1.ImprimirDatos();
        
        //------------------------------------------
        Carro car2 = new Carro("Tesla", "Model X", "David M.", "D14M4", 2021);
        
        System.out.println(" ");
        car2.ImprimirDatos();
        
        //----------------------------------------------------------------------
        Carro car3 = new Carro();
        
        car3.setDueño("Juan P");
        car3.setMarca("Audi");
        car3.setModelo("A6");
        car3.setPlacas("J65P8");
        car3.setAño(1995);
        System.out.println(" ");
        car3.ImprimirDatos();
    }  
}
