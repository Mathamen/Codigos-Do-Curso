package Listas.Lista1.L1Exercício3_a_5;

public class TestaCasa {
    public static void main(String args[]){
        Casa c1= new Casa();
        Casa c2= new Casa();
        c1.numero= 1;
        c2.numero= 2;
        
        c1.cor= "coral";
        c2.cor= "bege";
        System.out.println("A casa de número " + c1.numero + " tem cor " + c1.cor);
        System.out.println("A casa de número " + c2.numero + " tem cor " + c2.cor);
        c1.janela= new Janela();
        c2.janela= new Janela();
        c1.janela.material= "Alumínio";
        c2.janela.material= "Madeira";
        System.out.println(c1.janela.material);
    }
}
