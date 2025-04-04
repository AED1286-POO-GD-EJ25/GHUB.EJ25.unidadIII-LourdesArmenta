package conversiones;

public class Barco {
    //constructor
    public Barco(){
        System.out.println("\tSe crea parte de una barco");
    }
    //personalizado
    public void alarma(){
        System.out.println("\tSOS desde un barco");
    }
    public void alarma(String msg){
        System.out.println("\tMensaje "+msg+" enviado desde un barco");
    }

    
}
