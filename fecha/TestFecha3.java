package fecha;
import java.util.Scanner;

public class TestFecha3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//el usuario ingrese los datos de la fecha
		System.out.println("Ingrese Fecha1 (dia,mes y anio):");
		int dia = scanner.nextInt();
		int mes = scanner.nextInt();
		int anio = scanner.nextInt();
		//crear el objeto de la clase Fecha
		Fecha f1 = new Fecha();
		f1.setDia(dia);
		f1.setMes(mes);
		f1.setAnio(anio);
		
		System.out.println("Ingrese Fecha2 (dia,mes y anio):");
		dia = scanner.nextInt();
		mes = scanner.nextInt();
		anio = scanner.nextInt();
		//crear el objeto de la clase Fecha
		Fecha f2 = new Fecha();
		f2.setDia(dia);
		f2.setMes(mes);
		f2.setAnio(anio);
		
		if(f1.equals(f2))
		{
			System.out.println("Son iguales!");
		}else {
			System.out.println("Son Distinta!!");
		}
		
		
		

	}

}

