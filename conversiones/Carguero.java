package conversiones;

public class Carguero extends DeVapor{
    public Carguero(){
        System.out.println("Se crea la parte del barco Carguero");
    }
    @Override
    public void alarma(){
        System.out.println("\tSOS desde un barco Carguero");

    }
    
}
