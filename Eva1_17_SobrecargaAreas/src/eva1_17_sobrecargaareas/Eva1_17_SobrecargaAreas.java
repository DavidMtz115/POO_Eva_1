
package eva1_17_sobrecargaareas;

/*
 David
 */
public class Eva1_17_SobrecargaAreas {

    public static void main(String[] args) {
        System.out.println("Area del circulo: "+ Areas(5.0));
        System.out.println("Area del triangulo: "+ Areas(5.0,7.0));
        System.out.println("Area del trapecio: "+ Areas(5.0,7.0,6.0));
    }
    public static double Areas(double rad){
        return Math.PI * (rad * rad);
    }        
     public static double Areas(double B, double H){
         return (B * H)/2.0;
    }
    public static double Areas(double H, double B, double b){
        return H * (B + b) / 2.0;
    }
}
   
