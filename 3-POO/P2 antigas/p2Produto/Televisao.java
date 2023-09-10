package p2Produto;

public class Televisao extends Produto implements Ligavel{
    public void ligar(){
        System.out.println("Televisão ligando");
    }
    public Televisao(String idN){
        super(idN);
    }
}