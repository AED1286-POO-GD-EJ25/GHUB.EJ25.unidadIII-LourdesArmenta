package ventana;
public class Ventana{
    //atributos
    private String marco1;
    public String marco2;
    protected String marco3;
    String marco4;

    //constructores
    //metodos personalizados
    public final void copiar(Ventana w){
        System.out.println("estoy en el metodo copiar de la clase base con un argumento tipo Ventana");

    }
    
    public void copiar(String p, int x, int y){
        System.out.println("estoy en el metodo copiar de la clase base con 3 argumentos: String, int, int");

    }
    //getter y setter
    //metodos sobreescritos
   
}