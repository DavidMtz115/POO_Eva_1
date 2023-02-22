
package eva1_12_clifas;

/*
 David
 */
public class Eva1_12_Clifas {

    public static void main(String[] args) {
        String nota;
        nota=Califa(95);
        System.out.println("Califa: "+ nota );
        System.out.println("Califa para 70: " + Califa(70));
    }
    public static String Califa(int cal){
        
        String nota;
        if (cal >= 91 && cal <= 100){
            nota = "A";
        }else if (cal >= 81 && cal <= 90){
            nota = "B";
        }else if (cal >= 71 && cal <= 80){
            nota = "C";
        }else{
            nota = "D";
        }
        return nota;
        
    }
}
