package Listas.Lista1.Exercício1_e_2;

public class Gato {
    boolean vivo;
    String cor;
    int idade;
    String nome;
    void miar(){
        System.out.println("gato miando");
    }
    void imprimeGato(Gato g)
        {
            if (g.vivo=true){
                System.out.println("O nome do gato é " + g.nome + ", tem " + g.idade + " anos, de cor " + g.cor + "e ele está vivo.");
            }
            else{
                System.out.println("O nome do gato é " + g.nome + ", tem " + g.idade + " anos, de cor " + g.cor + "e ele está morto.");

            }
        }
}