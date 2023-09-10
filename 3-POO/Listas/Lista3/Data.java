package Listas.Lista3;

public class Data {
    private int dia;
    private int mes;
    private int ano;


    public int getDia(){
        return this.dia;
    }
    public void setDia(int alfa){
        this.dia= alfa;
    }

    public int getMes(){
        return this.mes;
    }
    public void setMes(int alfa){
        this.mes= alfa;
    }

    public int getAno(){
        return this.ano;
    }
    public void setAno(int alfa){
        this.ano= alfa;
    }

    public Data(){

    }
    public Data(int dia, int mes, int ano){
        this.dia= dia;
        this.mes= mes;
        this.ano= ano;
    }



}