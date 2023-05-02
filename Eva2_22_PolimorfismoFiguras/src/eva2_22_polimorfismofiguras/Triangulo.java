
package eva2_22_polimorfismofiguras;

/*
 David
 */
public class Triangulo implements Figuras, MostrarDatos{
    
    private double base;
    private double altura;
    
    //----------------------------
    public Triangulo() {
        this.altura = 0;
        this.base = 0;
    }
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //----------------------------------
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPeri() {
        double hip = Math.hypot(base, altura);
        return base + altura + hip;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Tirnagulo:");
        System.out.println("Base: " +base);
        System.out.println("Altura: " +altura);
        System.out.println("Area: " +calcularArea());
        System.out.println("Perimetro: " +calcularPeri());
    }
    
}
