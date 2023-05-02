
package eva2_18_interfaces_herencia;

/*
 David
 */
public class Eva2_18_Interfaces_Herencia {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

interface intA{
    void A();
}

interface intB{
    void B();
}

interface intC extends  intA, intB{
    void C();
}

class Prueba implements intC{

    @Override
    public void C() {
    }

    @Override
    public void A() {
    }

    @Override
    public void B() {
    }
}
