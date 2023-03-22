
package eva2_11_override_figuras;

/*
 David
 */
public class Triangulo extends Figura{
 
    private double base;
    private double altura;
    private double lado;
    
    //----------------------

    public Triangulo() {
        this.base = 0.0;
        this.altura = 0.0;
        this.lado = 0.0;
    }
    public Triangulo(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }
    
       @Override
    public String toString(){
        String cade = "DATOS: \n" +
                      "Área: " + calcularArea() + "\n" + 
                      "Perimetro: " + calcularPeri();
        return cade;
    }
    //---------------------------------------
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
    public double calcularArea(){
        return (base * altura) / 2;
    }
    @Override
    public double calcularPeri(){
        return lado +lado +lado;
    }
}
