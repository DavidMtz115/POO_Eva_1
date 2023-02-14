
package eva1_4_tv;

/*
 David
 */
public class Tele {
    private boolean power;
    private int vol, can;
    
    //contructores
    public Tele(){
        vol = 2;
        can = 99;
        power = false;//apagado                
    }
    //metodos
    //encender y apagar la tv
    public void cambiarEstado (){
        //verificar
        if (power == true){
            power = false;
            System.out.println("Apagando pantalla");
        }else{
            power = true;
            System.out.println("Encendiendo pantalla");
        }         
    }
    //volumen
    public void subirVolumen(){
        if (power){//la tele esta prendida
            if(vol < 100){
                vol++;//acumulador(vol+=1;;vol = vol +1
                System.out.println("Volumen: " + vol);
            }
        }    
    }
    public void bajarVolumen(){
        if (power){
            if(vol > 0){
                vol--;
                System.out.println("Volumen: "+ vol);
            }    
        }
    }
    public void subirCanal(){
        if (power){
            can ++;
            if(can > 100)
                can = 0;
                System.out.println("Canal " +can);
        }
    }
    public void bajarCanal(){
        if (power){
            can--;
            if(can < 0)
                can= 100;
                System.out.println("Canal " +can);
        }
    }
}
