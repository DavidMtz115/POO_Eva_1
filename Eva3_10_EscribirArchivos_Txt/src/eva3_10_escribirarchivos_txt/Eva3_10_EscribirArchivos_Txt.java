package eva3_10_escribirarchivos_txt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 David
 */
public class Eva3_10_EscribirArchivos_Txt {

    public static void main(String[] args){
        try {
            // TODO code application logic here
            String ruta = "D:\\Archivos_netB\\";
            
            writeUsingFiles(ruta + "archivoFiles.txt", "Prueba de escritura de archivos \n" + "Usando Files");
            
            writeUsingFileWriter(ruta + "archivoFileWreiter.txt", "Usando la clase FileWriter");
            
            writeUsingBufferedWriter(ruta + "archivoBufferedWriter.txt", "Usando la clase BufferedWriter");
            
        } catch (IOException ex) {
            Logger.getLogger(Eva3_10_EscribirArchivos_Txt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
    public static void writeUsingFiles(String ruta, String datos) throws IOException{
        Path path = Paths.get(ruta);
        Files.write(path, datos.getBytes());
    }
    
    //---------------------------------------------------------------------------------------------
    public static void writeUsingFileWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta);
        FileWriter filewriter = new FileWriter(file);
        filewriter.write(datos);
        filewriter.close();
    }
    
    //-------------------------------------------------------------------------------------------------------
    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta);
        FileWriter filewriter = new FileWriter(file);
        BufferedWriter bufwriter = new BufferedWriter(filewriter);
        for (int i = 0; i < 5; i++) {
            bufwriter.write((i+1) + " " + datos);
            bufwriter.write("\n");
        }
        bufwriter.close();
        filewriter.close();
    }
}
