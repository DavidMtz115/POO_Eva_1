
package eva2_20_vehiculo;

/*
 David
 */
public class Automovil extends Vehiculo implements ControlVelocidad {
    
    private String modelo;
    
    //--------------------------------------------

    public Automovil() {
    }

    public Automovil(String modelo) {
        this.modelo = modelo;
    }

    public Automovil(String modelo, int velocidad, String marca) {
        super(velocidad, marca);
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }

    //----------------------------------------------------------
    public void setModelo(String modelo) {    
        this.modelo = modelo;
    }

    //--------------------------------------------------
    @Override
    public int acelerar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int detener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimirVel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
