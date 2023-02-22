
package eva1_11_return;

/*
 David
 */
public class Eva1_11_Return {

    public static void main(String[] args) {
        int resu;
        resu = square(10);//invocacion o llamada a funcion
        System.out.println("Resultado: " + resu);
    }
    public static int square(int num){
        return num * num;
    }
}
