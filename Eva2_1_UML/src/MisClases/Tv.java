
package MisClases;

/*
 David
 */
public class Tv {
    
    private int canal, volumen;
    private boolean power;
    
    //-----------------------------
    public void setCanal(int valor){
        canal = valor;
    }
    public void setVolumen(int valor){
        volumen = valor;
    }
    public void setPower(boolean valor){
        power = valor;
    }
    public int getCanal(){
        return canal;
    }
    public int getVolumen(){
        return volumen;
    }
    public boolean getPower(){
        return power;
    }
    
    //-----------------------------------------
    public void impremirDatos(){
        System.out.println("Power: "+ power);
        System.out.println("Canal: "+ canal);
        System.out.println("Volumen: "+ volumen);        
    } 
}
