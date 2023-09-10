package Aula3;

import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String [] args) {
		Conta x = new Conta();
		x.setNomeCliente("Joana");
		x.depositar(15);
		System.out.println("Quanto quer sacar?");
		Scanner sc = new Scanner(System.in);
		double val= sc.nextDouble();
		if( x.debitar(val) ) {
		System.out.println("Liberando "+ val + " reais ");
		System.out.println("Saldo: " + x.getSaldo());
		}
		Jogador fred= new Jogador("Fred", 84, 1.72);
		System.out.println(Math.random());
		Contador cont= new Contador();
		cont.a=10;
		cont.b=3;
		Contador cont2= new Contador();
		cont2.a=8;
		cont2.b=7;
		System.out.println(cont.a);
		System.out.println(cont.b);
		System.out.println(cont2.a);
		System.out.println(cont2.b);
		Leao n= new Leao();
		n.rugir();
	}
	
}

