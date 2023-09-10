package Aula1;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Gato g1= new Gato();
    System.out.println("algo");
    g1.nome="Felix";
    g1.idade=8;
    Gato g2= new Gato();
    g2.nome="Romeu";
    g2.idade=6;
    System.out.println(g1.nome + g1.idade + "Nome e idade");
    System.out.println(g2.nome + g2.idade + "Nome e idade");
  }
}