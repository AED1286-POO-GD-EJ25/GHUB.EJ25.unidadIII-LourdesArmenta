package fecha;
import java.util.Scanner;
public class TestFecha4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una Fecha (dd/mm/aaa):");

        String sFecha = scanner.nextLine();

        Fecha f = new Fecha(sFecha);

        System.out.println("La fecha ingresada es: "+f);
        
        
    }

}