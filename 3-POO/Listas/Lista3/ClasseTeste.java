package Listas.Lista3;

public class ClasseTeste {
    public static void main(String [] args){
        ContaBancaria c= new ContaBancaria();
        Data d= new Data();
        c.setDataAbertura(1, 1, 2023);
        System.out.println(c.getDataAberturaFormatada());
    }
}
