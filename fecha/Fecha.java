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
    public Fecha(String s){
         //buscamos la primera coincidencia de /
         int pos1 = s.indexOf('/');

         //buscamos la ultima posicion del /
         int pos2 = s.lastIndexOf('/');
 
         //procesar el dia
         String sDia = s.substring(0, pos1);
         this.dia = Integer.parseInt(sDia);
 
         //procesamos el mes
         String sMes = s.substring(pos1+1,pos2);
         this.mes = Integer.parseInt(sMes);
 
         //procesamos el anio
         String sAnio = s.substring(pos2+1);
         this.anio = Integer.parseInt(sAnio);

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
