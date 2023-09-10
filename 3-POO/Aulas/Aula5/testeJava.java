import java.util.*;


public class testeJava {
	public static final double PI= 3; // isso aqui é pra declarar uma constante
	public static final String DIRETORIO_RAIZ= "d:/";
	public final void correr() {
		
	} // ESSE MÉTODO É FINAL, NÃO PODE SER SOBRESCRITO POR SUBCLASSES, E SE FOR COLOCADO NO NOME DA CLASSE
	  // A CLASSE NAO PODE SER SOBRESCRITA
	public static void main(String args[]) {
		System.out.println(Math.PI);
		ArrayList x= new ArrayList();
		x.add("Casa");
		x.add("Mesa");
		x.add("Abacate");
		System.out.println(x.size());
		x.add(new Gorila());
		System.out.println(x.contains("Mesa"));
		x.remove("Casa");
		System.out.println(x);
		String a;
		
		
		int soma=0;
		int quantidadeString=0;
		float media=0F;
		
		for (int i=0;i<x.size(); i++) {
			Object meuObj = x.get(i);
			if (x.get(i) instanceof String) {
				soma= soma +  ((String)(meuObj)).length();
				quantidadeString ++;
			}
			}
		media= (float)(soma)/ quantidadeString;
		System.out.println(media);
		
	}
	// ORDEM IMPORTA EM JAVA
	// INT [] I, J DOIS ARRAYS DE INTEIRO
	// INT I, J[], I E UM INTEIRO E J UM ARRAY DE INTEIRO
	public static void iniciarCorrida(Animal[] x) {
		for (int i=0; i <x.length; i++)
			if (x[i] instanceof Corredor)
				( (Corredor )x[i] ).correr();
	}
	
}
