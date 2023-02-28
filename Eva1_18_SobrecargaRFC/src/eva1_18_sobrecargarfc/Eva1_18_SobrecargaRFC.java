
package eva1_18_sobrecargarfc;

/*
 David
 */
public class Eva1_18_SobrecargaRFC {

    public static void main(String[] args) {
        String rfc = generarRFC("DAVID", "MARTINEZ", "ESPINOZA", 2004, 12, 14);
        System.out.println(rfc);
    }
    public static String generarRFC(String nombre, String AP, String AM, int año, int mes, int dia){
        String ap1 = AP.charAt(0) + "";
        String ap2 = AP.charAt(1) + "";
        String am = AM.charAt(0) + "";
        String nb = nombre.charAt(0) + "";
        String rfc = ap1 + ap2 + am + nb + año + mes + dia + "";
        return rfc;
    }
    
}
