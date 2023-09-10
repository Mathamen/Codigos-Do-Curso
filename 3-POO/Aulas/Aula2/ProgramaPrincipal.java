package Aula2;
import java.util.Scanner;
public class ProgramaPrincipal {
	public static void main(String[] args) {
		/*System.out.println("oi");
		Cachorro c= new Cachorro();
		Cachorro c2= new Cachorro();
		c.nome="Pluto";
		c.idade=10;
		c2.nome="Bidu";
		System.out.println(c2.idade);
		c2.latir();
		
		
		byte b=-128;
		int ca= 32451;
		byte k = (byte)ca;
		System.out.println(k);
		long cpf= 18097494752L; //tem que colocar um L pois qualquer numero é considerado um inteiro por padrao , para float e doubles tbm tem isso, float é maior e tem que colocar F
		
		byte sigma= 5;
		byte alpha= 5;
		byte eplison= (byte)(sigma+alpha); // tem que colocar a modelagem pq toda operação gera como resultado um inteiro por padrão
		//obrigado java por ser tão mal feito.
		//++sigma;
		//sigma++;
		int ka= 5;
		int me= ++ka;
		System.out.println(ka +"  "+ me);
		
		
		System.out.println("Insira um nome");
		Scanner sc= new Scanner(System.in);
		String nome=sc.nextLine();
		System.out.println("Insira uma idade");
		int idade= sc.nextInt();
		System.out.println("A idade de " +nome+ " é " +idade);
		
		*/
		/* Scanner sc= new Scanner(System.in);
		Cachorro c1= new Cachorro();
		Cachorro c2= new Cachorro();
		System.out.println("Insira o nome do cachorro 1");
		sc= new Scanner(System.in);
		c1.nome= sc.nextLine();
		System.out.println("Insira a idade do cachorro 1");
		sc= new Scanner(System.in);
		c1.idade= sc.nextInt();
		
		
		
		System.out.println("Insira o nome do cachorro 2" + "");
		sc= new Scanner(System.in);
		c2.nome= sc.nextLine();
		System.out.println("Insira a idade do cachorro 2");
		sc= new Scanner(System.in);
		c2.idade= sc.nextInt();
		
		System.out.println(c1.nome +c1.idade +c2.nome +c2.idade);
		*/
		

		
		int soma= 0;
		int x[]= new int [5];
		x[0]=8;
		x[3]=4;
		for (int i =0; i< x.length; i++) {
		soma +=x[i];
		}
		System.out.println(soma);
		double b= (double) soma/(x.length);
		System.out.println((double) soma/x.length ); 
		System.out.println( b ); 
		

		
		
		
}
}