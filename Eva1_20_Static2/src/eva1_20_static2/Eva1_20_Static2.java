
package eva1_20_static2;

/*
 David
 */
public class Eva1_20_Static2 {

    public static void main(String[] args) {
        /*final int x;
        x= 100;
        x=200;*/
        FormulasGeometria form = new FormulasGeometria();
            //form. no existe ningun metodo dentro del objeto
        System.out.println("Mi PI: "+ FormulasGeometria.PI);
        System.out.println("Area triangulo: "+ FormulasGeometria.areaTriangulo(5.0, 5.0));
        System.out.println("Volumen esfera: "+ FormulasGeometria.volumenEsfera(10.0));
    } 
}
