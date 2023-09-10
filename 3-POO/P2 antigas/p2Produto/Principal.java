package p2Produto;
import java.util.*;

public class Principal{

    public static void main(String[] args){
        System.out.println("Inisira o id do produto que busca");
        Scanner sc= new Scanner(System.in);
        String buscado= sc.nextLine();
        List x= Utils.getList();
        if (x.contains(buscado)){
            int a = x.indexOf(buscado);
            Produto p = (Produto)x.get(a);
            System.out.println(p);
        }

    }

}