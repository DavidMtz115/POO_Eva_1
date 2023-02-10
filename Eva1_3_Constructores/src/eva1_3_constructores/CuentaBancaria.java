
package eva1_3_constructores;

/*
 David
 */
public class CuentaBancaria {
    //Atributos de la clase
    private String cuenta,cliente;
    private double saldo;
    
    //constructores
    //defautl (nada entre parentesis) y con argumentos
    //los metodos se diferencian por los argunmentos dentro del parentesis
    public CuentaBancaria(){
        cuenta = "0";
        saldo = 0;
        cliente = "--";
    }
    public CuentaBancaria(String nCliente,String nCuenta,double nSaldo){
        cliente = nCliente;
        cuenta = nCuenta;
        saldo = nSaldo;
    }
    
    //metodos get y set
    public String getCuenta(){
        return cuenta;
    }    
    public void setCuenta(String valor){
        cuenta = valor;
    }
    public String getCliente(){
        return cliente;
    }    
    public void setCliente(String valor){
        cliente = valor;
    }
    public double getSaldo(){
        return saldo;
    }    
    public void setSaldo(double valor){
        saldo = valor;
    }
    public void imprimirDatos(){
        System.out.println("Datos de la cuenta: ");
        System.out.println("Cliente: "+ cliente);
        System.out.println("Cuenta: "+ cuenta);
        System.out.println("Saldo: "+"$"+ saldo);
    }
        
    
}
