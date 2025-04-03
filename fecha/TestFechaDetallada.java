package fecha;

import java.util.Scanner;

public class TestFechaDetallada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una Fecha (DD/MM/AAAA):");

        //leemos la fecha
        String sFecha = entrada.nextLine();

        //creamos un objeto de la clase FechaDetallada
        FechaDetallada f = new FechaDetallada(sFecha);

        //mostra la fecha que acabamos de capturar
        System.out.println("Fecha: "+f);

        //el usuario ingresa la cantidad de dias a sumar
        System.out.print("Ingresa dias a sumar (puede ser negativo):");
        int diasSum = entrada.nextInt();

        //le sumanos esos dias a la fecha
        f.addDias(diasSum);

        //mostramos la nueva fecha
        System.out.println("Sumando: "+f);

        
    }
    
}
