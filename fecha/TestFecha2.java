package fecha;

public class TestFecha2 {

	public static void main(String[] args) {
		Fecha f ; //crea la variable tipo fecha 
		f = new Fecha(); //inicaliza la varaible fecha
		
		System.out.println("Dia = "+f.getDia());
	    System.out.println("Mes = "+f.getMes());
	    System.out.println("Anio = "+f.getAnio());
	    
	    System.out.println(f);
	    
	    Fecha f2;
	    f2=new Fecha(1,10,2000);
	    System.out.println("Dia = "+f2.getDia());
	    System.out.println("Mes = "+f2.getMes());
	    System.out.println("Anio = "+f2.getAnio());
	    
	    System.out.println(f2);
	    
		

	}

}

