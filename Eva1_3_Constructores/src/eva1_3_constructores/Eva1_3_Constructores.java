
package eva1_3_constructores;


public class Eva1_3_Constructores {

    /*
     David
     */
    public static void main(String[] args) {
        //nombre da la clase seguido de parentesis ees un constructor
        CuentaBancaria cuenta1 = new CuentaBancaria("David Martínez", "D22550287", 4444.4444);
        
        /*cuenta1.setCliente("David Martínez");
        cuenta1.setCuenta("D22550287");
        cuenta1.setSaldo(4444.4444);
        /*
        cuenta1.imprimirDatos();
        */
        String cliente = cuenta1.getCliente();
        String cuenta = cuenta1.getCuenta();
        double saldo = cuenta1.getSaldo();
        
        System.out.println("Cliente: "+cliente);
        System.out.println("Num. cuenta: "+cuenta);
        System.out.println("Saldo: $"+saldo);
        //--------------------------------------------------
        CuentaBancaria cuenta2 = new CuentaBancaria("Elon Musk", "E6713876", 700000000);
        
        String cliente2 = cuenta2.getCliente();
        String cuent2 = cuenta2.getCuenta();
        double saldo2 = cuenta2.getSaldo();
        
        System.out.println(" ");
        System.out.println("Cliente: "+cliente2);
        System.out.println("Num. cuenta: "+cuent2);
        System.out.println("Saldo: $"+saldo2);
        //--------------------------------------------
        CuentaBancaria cuenta3 = new CuentaBancaria();
        
        String cliente3 = cuenta3.getCliente();
        String cuen3 = cuenta3.getCuenta();
        double saldo3 = cuenta3.getSaldo();
        
        System.out.println(" ");
        System.out.println("Cliente: "+cliente3);
        System.out.println("Num. cuenta: "+cuen3);
        System.out.println("Saldo: $"+saldo3);
        
    }
}
