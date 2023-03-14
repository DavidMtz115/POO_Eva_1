
package eva2_8_super;

/*
 David
 */
public class Eva2_8_Super {

    public static void main(String[] args) {
        
        Animal an = new Animal("asfas",10);
        
        Mamifero ma = new Mamifero("negro","ssfafa",20);
        
        Canes can = new Canes();
    }    
}

class Animal{
    
    private String nombre;
    private int pseo;
    
    //--------------------------------------
    public Animal(){
        System.out.println("Its Alive!!");
    }
    public Animal(String nombre, int pseo) {
        this.nombre = nombre;
        this.pseo = pseo;
        System.out.println("Its Alive constructor 2!!!!");
    }

    //---------------------------------------
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPseo() {
        return pseo;
    }
    public void setPseo(int pseo) {
        this.pseo = pseo;
    }
    
    public void respirar(){
        System.out.println("Estoy respirando");
    }
}

class Mamifero extends Animal{
    private String colorPelo;
    
    //----------------------------------------
    public Mamifero(){
        //super --> apuntador a la supercalse
        //lo primero a llamar en un constructoe es 
        //llamar al constructor de una clase
        super();//llamda al constructor default
        System.out.println("mamifero!!");
    }
    public Mamifero(String colorPelo, String nombre, int pseo) {
        super(nombre, pseo);//llamda al contructor de la superclase
        this.colorPelo = colorPelo;
        System.out.println("mamifero contructor 2!!");
    }
    
    //-------------------------------------------------
    public String getColorPelo() {
        return colorPelo;
    }
    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }   
}

class Canes extends Mamifero{

    public Canes() {
        super();
        System.out.println("Soy un can");
    }
        
}