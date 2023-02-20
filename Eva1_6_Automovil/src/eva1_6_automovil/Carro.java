
package eva1_6_automovil;

/*
 David
 */
public class Carro {
    //variables
    String marca,modelo,dueño,placas;
    int año;
    
    //constructor default
    public Carro(){
        marca = "----";
        modelo = "----";
        placas = "00000";
        dueño = "----";
        año = 0000;
    }
    //constructor con argumentos
    public Carro(String mc, String md, String du, String pl, int a){
        marca = mc;
        modelo = md;
        dueño = du;
        placas = pl;
        año = a;
    }
    
    //metodos get y set   
    public void setMarca(String valor){
        marca = valor;
    } 
    public String getMarca(){
        return marca; 
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    public String getModelo(){
        return modelo;
    }
    public void setDueño(String valor){
        dueño = valor;
    }
    public String getDueño(){
        return dueño;
    }
    public void setPlacas(String valor){
        placas = valor;
    }
    public String getPlacas(){
        return placas;
    }
    public void setAño(int valor){
        año = valor;
    }
    public int getAño(){
        return año;
    }
    
    //metodo para calcular la revalidacion
    public int CalcularRev(){
        
        int adeudo = 0;
        if (año <= 2000 && año>= 1950){
            adeudo = 1500;
        }else if (año <= 2005 && año>= 2001){
            adeudo = 2000;
        } else if (año <= 2010 && año>= 2006){
            adeudo = 2500;
        }else if (año <= 2015 && año>= 2011){
            adeudo = 3000;
        }else if(año <= 2023 && año>= 2016){
            adeudo = 4000;
        }else{
              adeudo = 0;          
        }
        return adeudo;
    }
    //metodo para imprimir datos
    public void ImprimirDatos(){
       System.out.println("Dueño del automovil: "+ dueño);
       System.out.println("Marca del automovil: "+ marca);
       System.out.println("Modelo del automovil: "+ modelo);
       System.out.println("Placas del automovil: "+ placas);
       System.out.println("Año del automovil: "+ año);
       System.out.println("Adeudo: $"+ CalcularRev());
    }
}
