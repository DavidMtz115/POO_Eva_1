
package eva1_16_sobrecarga2;

/*
 David
 */
public class Eva1_16_Sobrecarga2 {

    public static void main(String[] args) {
        System.out.println("Suma: "+ suma(3,8));
        System.out.println("Suma: "+ suma(3.0,8.0));
        System.out.println("Suma: "+ suma("Hola ","Mundo"));
        suma();
    }
    public static int suma(int val1, int val2){
        return val1 + val2;
    }
    public static double suma(double val1, double val2){
        return val1 + val2;
    }
    public static String suma(String val1, String val2){
        return val1 + val2;
    }
    public static void suma(){
        System.out.println("Metods sin parametros suma");
    }
}
