
package eva2_4_formatoapa;

/*
 David
 */
public class Articulo extends Documento{
    
    private String tipo;
    private int volumen;
    
    //--------------------------------
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getVolumen() {
        return volumen;
    }
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}
