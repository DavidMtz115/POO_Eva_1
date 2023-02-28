
package eva1_20_static2;

/*
 David
 */
public class FormulasGeometria {
    //Constante
    public static final double PI = 3.14159;
    //final:solo pueden asignar una vez un valor a ka variable
    //area triangulo
    public static double areaTriangulo(double B, double A){
        return (B * A) / 2;
    }
    //area circulo
    public static double areaCirculo(double R){
        return PI * (R * R);
    }
    //perimetro circulo
    public static double perimetroCirculo(double R){
        return PI * (R * 2);
    }
    //volumen esfera
    public static double volumenEsfera(double R){
        return (4.0/3.0) * PI * (R *R *R);
    }
}
