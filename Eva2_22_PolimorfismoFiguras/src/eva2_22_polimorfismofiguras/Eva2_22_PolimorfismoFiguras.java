
package eva2_22_polimorfismofiguras;

import java.util.Scanner;

/*
 David
 */
public class Eva2_22_PolimorfismoFiguras {

    public static void main(String[] args) {
        
        Circulo[] cir = new Circulo[10];
        //un arreglo en java va de la posicion 0 a la n-1
        //n es la cantidad de elementos del arreglo
        /*for (int i = 0; i < cir.length/*toma la cantidadd del arreglo; i++) {
            cir[i] = new Circulo(i);//creamos cada uno de los objetos
            cir[i].imprimirDatos();
        }*/
        Figuras[] fig;//declarando un arreglo, pero no lo hemos creado
        //con el scanner capturamos por el teclado la cantidad de figuras a utilizar
        Scanner A = new Scanner(System.in);
        System.out.println("¿Cuantas figuras quieres capturar?");
        int cant = A.nextInt();
        System.out.println("Cantidad: "+cant);
        fig = new Figuras[cant];//creamos el arreglo con la catudad de figuras que quiere el usuario
        
        for (int i = 0; i < cant; i++) {
            System.out.println("1. Circulo, 2.Triangulo");
            int figu = A.nextInt();
            if(figu == 1){//circulo
                Circulo circu = new Circulo();
                System.out.println("Introduuce el radio");
                circu.setRadio(A.nextDouble());
                fig[i] = circu;
            }else{//triangulo
                Triangulo tria = new Triangulo(); 
                System.out.println("Introduuce la basse");
                tria.setBase(A.nextDouble());
                System.out.println("Introduce la altura");
                tria.setAltura(A.nextDouble());
                fig[i] = tria;
            }
        }
        //imprimir los resultados
        for (int i = 0; i < fig.length; i++) {
            if(fig[i] instanceof Circulo){
                //System.out.println("Circulo");
                Circulo ci = (Circulo)fig[i];
                ci.imprimirDatos();
            }else{
                //System.out.println("Triangulo");
                Triangulo tr = (Triangulo)fig[i];
                tr.imprimirDatos();
            }
                
            //System.out.println("Area: "+fig[i].calcularArea());
            //System.out.println("Perimetro: "+fig[i].calcularPeri());
        }
    }
}
