
package eva1_5_circulo;

/*
 David
 */
public class Circulo {
    //variables
    private double a, p, r;
    
    //constructor default
    public Circulo(){
        r = 5; 
    }
    //contructor con argumentos
    public Circulo(double rd){
        r = rd;
    }
    //-------------------------------
    //metodos get y set
    public void setRadio(double valor){
        r = valor;
    }
    public double getRadio(){
        return r;
    }
    public double getArea(){
        return Math.PI * (r*r) ;
    }
    public double getPerimetro(){
        return Math.PI * r;
    }
    
    //----------------------------------
    //metodos para calcular el area y el perimetro
    public void CalcularArea(){
        a = Math.PI * (r*r);
        System.out.println("El area es: "+ a);
    }
    public void CalcularPerimetro(){
        p = 2 * Math.PI * r;
        System.out.println("El perimetro es: "+ p);
    }
}
