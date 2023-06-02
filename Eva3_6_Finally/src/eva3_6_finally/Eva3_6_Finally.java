package eva3_6_finally;

/*
 David
 */

public class Eva3_6_Finally {

    public static void main(String[] args) {

        int x = 9, y = 1;
        try {
            int resu = x / y;
            System.out.println("Resultado: " + resu);
        } catch (ArithmeticException e) {
            System.out.println("No se pude dividie entr cero");
        } finally {//obliga a la ejecución de esta seccion de codigo
            //es opcional
            System.out.println("Siempre me voy a ejecutar!!");
        }
        System.out.println("Fin del programa");
    }

}
