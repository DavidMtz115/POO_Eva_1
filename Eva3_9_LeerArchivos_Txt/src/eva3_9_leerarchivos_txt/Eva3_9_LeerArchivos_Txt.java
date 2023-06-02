package eva3_9_leerarchivos_txt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/*
 David
 */
public class Eva3_9_LeerArchivos_Txt {

    final static String RUTA = "D:\\Archivos_netB\\Prueba.txt";

    public static void main(String[] args) {

        try {
            readingUsingFiles(RUTA);//Lee un archivo completo, ineficiente con archivos grandes
            readingUsingBufferedReader(RUTA);//Mejor opcion para leer texto
            readingUsingFileReader(RUTA);//Hibrido con buffered, pero ineficiente
            readingUsingScanner(RUTA);//Herramienta para procesar inputs
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //------------------------------------------------------------------------------------
    /* Files: se lee todo el contenido del archivo y se transfiere a 
    memoria principal (RAM) util con archivos pequeños */
    public static void readingUsingFiles(String ruta) throws IOException {
        System.out.println("Leer Un Archivo Con Files");
        Path path = Paths.get(ruta);
        List<String> todasLineas = Files.readAllLines(path);
        System.out.println("Resultado:");
        //System.out.println(todasLineas.toString());
        for (int i = 0; i < todasLineas.size(); i++) {
            System.out.println(todasLineas);
        }
        byte[] bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));
    }

    //------------------------------------------------------------------------------------------
    /*Permite procesar archivos mas grandes, ya que los lee por partes
    Enh el caso de texto, nmos permite procesarlo lina por linea
    Es un mecanismo adecuado para trabajar con multitarea(hilos)*/
    public static void readingUsingBufferedReader(String ruta) throws IOException {
        System.out.println("");
        System.out.println("Leer Un Archivo Con BufferedReader");
        File file = new File(ruta);
        FileInputStream fileINputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileINputStream);
        BufferedReader bufReader = new BufferedReader(inputStreamReader);
        String linea;
        while ((linea = bufReader.readLine()) != null) {
            System.out.println(linea);
        }
        bufReader.close();//cerrar el buffered
    }
    
    //-------------------------------------------------------------------------------------------
    //No es la mejor opcion para leer archivos de texto
    public static void readingUsingFileReader(String ruta) throws IOException {
        System.out.println("");
        System.out.println("Leer Un Archivo Con FileReader");
        File file = new File(ruta);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufReader = new BufferedReader(fileReader);
        String linea;
        while ((linea = bufReader.readLine()) != null) {
            System.out.println(linea);
        }
        bufReader.close();//cerrar el buffered
        fileReader.close();//cerrar el filereader
    }
    
    //---------------------------------------------------------------------------------------------
    
    public static void readingUsingScanner(String ruta) throws IOException{
        System.out.println("");
        System.out.println("Leer Un Archivo Con Scanner");
        Path path = Paths.get(ruta);
        Scanner scanner = new Scanner(path);
        while(scanner.hasNextLine()){
            String linea = scanner.nextLine();
            System.out.println(linea);
        }
        scanner.close();
    }
}
