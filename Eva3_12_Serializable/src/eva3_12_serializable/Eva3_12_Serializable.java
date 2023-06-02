package eva3_12_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 David
 */

public class Eva3_12_Serializable {

    public static void main(String[] args) {
        
        try {
            Persona per = new Persona("David", "Martínez", 18);
            guardarObjetos(per);
            try {
                Persona resu = leerObjetos();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Eva3_12_Serializable.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(Eva3_12_Serializable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void guardarObjetos(Persona per) throws IOException{
        FileOutputStream abrirArch = new FileOutputStream("D:\\Archivos_netB\\personas.per");
        ObjectOutputStream outStream = new ObjectOutputStream(abrirArch);
        outStream.writeObject(per);
        outStream.close();
    }
    
    public static Persona leerObjetos() throws IOException, ClassNotFoundException{
        Persona per = null;
        FileInputStream abrirArch = new FileInputStream("D:\\Archivos_netB\\personas.per");
        ObjectInputStream inStream = new ObjectInputStream(abrirArch);
        per = (Persona)inStream.readObject();
        return per;
    }
}

class Persona implements Serializable{
    
    private String nombre;
    private String apellido;
    private int edad;

    //---------------------------------------------------------------------
    public Persona() {
    }
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //---------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}