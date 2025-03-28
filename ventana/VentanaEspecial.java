package ventana;
public class VentanaEspecial extends Ventana{
    //atributos
    //constructores
    //metodos personalizados
    public void copiar(char c, int veces, int x, int y ){
        System.out.println("estoy en el metodo copiar con 4 argumentos: char, int,int,int");

    }

    //getter y setter
    //sobreescritura
    public void copiar(Ventana w){
        System.out.println("estoy en el metodo copiar de la clase derivada con un argumento tipo Ventana");

    }
    public void copiar(char c, int veces, double x, double  y ){
        System.out.println("estoy en el metodo copiar con 4 argumentos: char, int,double,double");

    }

}
