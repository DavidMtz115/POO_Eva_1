
package eva1_13_alcance;

/*
 David
 */
public class Eva1_13_Alcance {

    public static void main(String[] args) {
        int x = 100;//visible para todo lo que este dentro del main
        for (int i = 0; i < 10; i++) { //inicio del bloque for
            System.out.println("x: "+ x);//visible dentro del for
            System.out.println("i: "+ i);
            System.out.println("j: "+ j);//variable no es visible 
                                         //no esta declarada antes de la instrucción
            int j = 100;
            System.out.println("j: "+ j);
            {
                int z = 100;
                System.out.println("z: "+ z);
            }
            System.out.println("z: "+ z);
        }//termina bloque for
        System.out.println("i: "+ i);//no estan declaradas en el bloque
        System.out.println("j: "+ j);
    }
    public static void algo(){
        System.out.println("x: "+ x);// no es visible en algo()
    }
}
