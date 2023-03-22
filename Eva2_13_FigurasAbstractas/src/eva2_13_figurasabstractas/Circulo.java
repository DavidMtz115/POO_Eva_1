
package eva2_13_figurasabstractas;

/*
 David
 */
public class Circulo extends Figura{
    
    private double radio;
    
    //----------------------------
    public Circulo() {
        this.radio = 0.0;
    }
    public Circulo(double radio) {
        this.radio = radio;
    }

      @Override
    public String toString(){
        String cade = "DATOS: \n" +
                      "Área: " + calcularArea() + "\n" + 
                      "Perimetro: " + calcularPeri();
        return cade;
    }
    //--------------------------------
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }    
    
    @Override
    public double calcularArea(){
        return Math.PI * (radio*radio);
    }
    @Override
    public double calcularPeri(){
        return Math.PI * (radio *2);
    }
}
