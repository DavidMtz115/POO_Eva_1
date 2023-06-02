package eva3_13_append;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 David
 */
public class Eva3_13_Append {

    public static void main(String[] args) {
        // TODO code application logic here
         try {
            // TODO code application logic here
            String ruta = "D:\\Archivos_netB\\";
            
            writeUsingBufferedWriter(ruta + "archivoBufferedWriter.txt", "Usando la clase BufferedWriter");
            
        } catch (IOException ex) {
            ex.printStackTrace();//imprime la excepcion generada
        }
    }
    
     public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta);
        FileWriter filewriter = new FileWriter(file, true);
        BufferedWriter bufwriter = new BufferedWriter(filewriter);
        for (int i = 0; i < 5; i++) {
            bufwriter.write((i+1) + " " + datos);
            bufwriter.write("\n");
        }
        bufwriter.close();
        filewriter.close();
    }
}
