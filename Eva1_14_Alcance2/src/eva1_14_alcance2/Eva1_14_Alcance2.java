
package eva1_14_alcance2;

/*
 David
 */
public class Eva1_14_Alcance2 {

    public static void main(String[] args) {
        int x = 100;//visible dentro de todo el bloque main
        for (int i = 0; i < 10; i++) {
            int x = 100; //la variable esta declarada en main() 
                         //y es visible dentro del for
            
            int y = 100;//variable dentro del for
            if(i ==5){
                
            }
        }
        int y = 100;//aqui la variable y de ciclo for no exite
                    //podemos decalrar una variable del mismo nombre
    }   
}
