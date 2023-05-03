
package eva2_23_polimorfismo_vehiculos;

/*
 David
 */
public class Eva2_23_Polimorfismo_Vehiculos {

    public static void main(String[] args) {
     
        Automovil aut = new Automovil("X", 20, 0, "Tesla");
        cambiarVelocidad(aut, 20);
        Bicicleta bic = new Bicicleta("montaña", "XXX", 0, "Harley Davidson");
        System.out.println("");
        cambiarVelocidad(bic, 50);
        
    }
    public static void cambiarVelocidad(DatosVehiculo vehi, int vel){
        vehi.acelerar(vel);
        vehi.tablero();
    }
}
//---------------------------------------------------------------------------------------------------------------------------------------------
interface DatosVehiculo{
    
    void acelerar(int cambio);
    
    void tablero();
}
//--------------------------------------------------------------------------------------------------------------------
class Vehiculo{
    protected int velocidad;
    protected String marca;
    
    //-----------------------------
    public Vehiculo() {
        this.velocidad = 0;
        this.marca = "---";
    }
    public Vehiculo(int velocidad, String marca) {
        this.velocidad = velocidad;
        this.marca = marca;
    }
    
    //------------------------------------
    public int getVelocidad() {
        return velocidad;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
//-----------------------------------------------------------------------------------------------------------------------------------
class Automovil extends Vehiculo implements DatosVehiculo{
    private String modelo;
    private int año;
    
    //----------------------------
    public Automovil() {
        super();
        this.modelo = "-----";
        this.año = 0;
    }
    public Automovil(String modelo, int año, int velocidad, String marca) {
        super(velocidad, marca);
        this.modelo = modelo;
        this.año = año;
    }
    
    //-----------------------------------------------
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }    

    @Override
    public void acelerar(int cambio) {
        int cambioVel = velocidad  + cambio;
        if((cambioVel) >=0)//aceptar solo velocidades positivas
        velocidad = cambioVel;//velocidada = velociadad + cambio <---acumulador
    }
    @Override
    public void tablero() {
        System.out.println("Velocidad del automovil: " +velocidad);
    }
}
//---------------------------------------------------------------------------------------------------------------------------------
class Bicicleta extends Vehiculo implements DatosVehiculo{
    private String tipo;
    private String rodada;
    
    //--------------------------------
    public Bicicleta() {
        super();
        this.tipo = "-------";
        this.rodada = "------";   
    }
    public Bicicleta(String tipo, String rodada, int velocidad, String marca) {
        super(velocidad, marca);
        this.tipo = tipo;
        this.rodada = rodada;
    }
    
    //------------------------------------
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getRodada() {
        return rodada;
    }
    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

     @Override
    public void acelerar(int cambio) {
        int cambioVel = velocidad  + cambio;
        if(cambioVel >=0)//aceptar solo velocidades positivas
        velocidad = cambioVel;//velocidada = velociadad + cambio <---acumulador
    }
    @Override
    public void tablero() {
        System.out.println("Velocidad de la bicicleta: " +velocidad);
    }
    
}