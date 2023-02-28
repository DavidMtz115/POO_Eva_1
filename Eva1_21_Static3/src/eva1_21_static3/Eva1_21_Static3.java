
package eva1_21_static3;

/*
 David
 */
public class Eva1_21_Static3 {

    public static void main(String[] args) {
        
        System.out.println(Prueba.valor);
        Prueba.valor++;
        System.out.println(Prueba.valor);//si se modifico
        
        PruebaOjetos prueb = new PruebaOjetos();
        System.out.println(prueb.valor);
        prueb.valor++;
        System.out.println(prueb.valor);
        PruebaOjetos prueb2 = new PruebaOjetos();
        System.out.println(prueb2.valor);
    }
    
}
class Prueba{
public static int valor = 100;
}
class PruebaOjetos{
    public int valor= 100;
}