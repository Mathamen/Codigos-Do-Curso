package p2Produto;

public class Produto {
    private String id;
    private String cor;
    private double preco;



    public String getId(){
        return this.id;
    }

    
    public boolean exists(Object x){
        if (x instanceof Produto)
            if (this.id.equals(((Produto)x).getId()))
            return true;
        return false;
    }
    public String toString(){
        return "id do biscoito: " + this.id + ", cor do biscoito: " + this.cor + ", preço do biscoito: " + this.preco; 
    }



    public Produto(String idN){
        this.id= idN;
    }
}
