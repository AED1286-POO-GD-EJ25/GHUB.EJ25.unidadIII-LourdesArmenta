package fecha;
public class Fecha{
    //atributos
    private int dia;
    private int mes;
    private int anio;
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

}
