
package eva2_4_formatoapa;

/*
 David
 */
public class Documento {
  
    private String autor;
    private String titulo;
    private int año;
    private int mes;
    private int dia;
    private String ciudad;
    
    //----------------------------
    public Documento() {
    }
    public Documento(String autor, String titulo, int año, int ames, int dia, String ciudad) {
        this.autor = autor;
        this.titulo = titulo;
        this.año = año;
        this.mes = ames;
        this.dia = dia;
        this.ciudad = ciudad;
    }
    
    //---------------------------------------------
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public int getMes() {
        return mes;
    }
    public void setAmes(int ames) {
        this.mes = ames;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
