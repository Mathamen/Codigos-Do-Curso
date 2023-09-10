package p2Ninja;
import java.util.*;
public class SistemaPrincipal {
    public static void main(String[] args){
        Academia a= new Academia("SmartFit");
        Scanner sc= new Scanner(System.in);
        System.out.println("Insira a quantidade de ninjas a serem matricualdos:");
        int qtd= sc.nextInt();
        sc.close();
        for(int i=0; i<qtd; i++){
            System.out.println("Insira o tipo de ninja a ser colocado na academia, 1 para Genin, 2 para Chunin 3 para Jonin");
            Scanner sc2= new Scanner(System.in);
            int tipo = sc2.nextInt();

            System.out.println("Insira o cpf do ninja");
            Scanner sc3= new Scanner(System.in);
            String cpfN= sc3.nextLine();

            System.out.println("Insira o nome do ninja");
            Scanner sc4= new Scanner(System.in);
            String nomeN= sc4.nextLine();

            System.out.println("Insira a idade do ninja");
            Scanner sc5= new Scanner(System.in);
            int idadeN= sc5.nextInt();



            switch(tipo){
                case 1: {
                    Genin g = new Genin(cpfN, nomeN, idadeN); 
                    a.matriculaNinja(g);
                    break;
                }
                case 2:{
                    Chunin c= new Chunin(cpfN,nomeN,idadeN);
                    a.matriculaNinja(c);
                    break;
                }
                case 3:{
                    Jonin j= new Jonin(cpfN, nomeN, idadeN);
                    a.matriculaNinja(j);
                    break;
                }
                default:{
                    break;
                }
            }
        }
        System.out.println("Ninjas cadastrados");
        String cpfBusca = "a";
        while(!(cpfBusca.equals(0))){
            Scanner sc6 = new Scanner(System.in);
            System.out.println("Digite o cpf a ser buscado");
            cpfBusca= sc6.nextLine();
            Ninja busca= new Ninja(cpfBusca);
            boolean b= a.imprimeDadosNinjaSeExistir(busca);
            if (b== false){
                System.out.println(" O ninja não está matricualdo");
            }
        }
        System.out.println(a.toString());
        Collections.sort(a.getListaNinjas(), Comparator.comparingInt( Ninja::getIdade ));
        System.out.println(a);
    }
}
