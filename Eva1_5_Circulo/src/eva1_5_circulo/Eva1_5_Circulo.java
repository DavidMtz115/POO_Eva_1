
package eva1_5_circulo;

/*
 David
 */
public class Eva1_5_Circulo {

    public static void main(String[] args) {
        Circulo cir1 = new Circulo();
        
        cir1.CalcularArea();
        cir1.CalcularPerimetro();
        
        //-----------------------------
        Circulo cir2 = new Circulo(6);
        
        System.out.println(" ");
        cir2.CalcularArea();
        cir2.CalcularPerimetro();
        
        //-------------------------------------
        Circulo cir3 = new Circulo();
        
        System.out.println(" ");
        cir3.setRadio(7);
        System.out.println("El area es: "+ cir3.getArea());
        System.out.println("El perimetro es: "+ cir3.getPerimetro());
        
        //-------------------------------------------------------------
    }
}
