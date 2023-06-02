package eva3_3_trycatch;

/*
 David
 */
public class Eva3_3_TryCatch {

    public static void main(String[] args) {
        // TODO code application logic here 
        int x = 5, y = 0;
        try {
            int resu = x / y;
            System.out.println("El resultado es= " + resu);
        } catch(Exception e){
            System.out.println("Excepcion: " + e.getMessage());
        }
        System.out.println("Fin del programa");
    }

}
