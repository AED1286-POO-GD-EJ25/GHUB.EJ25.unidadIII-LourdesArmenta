package fecha;
public class Fecha{
    //atributos
    private int dia;
    private int mes;
    private int anio;
    //constructor 
    public Fecha() {
    	dia=1;
    	mes=1;
    	anio=1900;
    }
    public Fecha(int d, int m, int a) {
    	dia=d;
    	mes=m;
    	anio = a;
    }
    //getter y setter
    public int getDia(){
        return this.dia;

    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public int getMes(){
        return this.mes;

    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public int getAnio(){
        return this.anio;

    }
    public void setAnio(int anio){
        this.anio = anio;
    }

    @Override
    public String toString(){
        return dia+"/"+mes+"/"+anio;
    }
    
    @Override
    public boolean equals(Object o) {
    	Fecha otra = (Fecha)o; // conviernte el argumento o en un tipo fecha 
    	                       //utilizando una operacion de cast
    	return (this.dia == otra.dia) && (this.mes == otra.mes ) && (this.anio==otra.anio);
    	
    }

}
