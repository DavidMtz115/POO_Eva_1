
package eva2_4_formatoapa;

/*
 David
 */
public class Libro extends Documento{
    
    private String editoria;
    private String genero;
    
    //---------------------------------
    public String getEditoria() {
        return editoria;
    }
    public void setEditoria(String editoria) {
        this.editoria = editoria;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }  
}
