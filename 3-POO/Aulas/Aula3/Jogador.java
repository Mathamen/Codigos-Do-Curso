package Aula3;
// javaBean
public class Jogador {
	private String nome;
	private double peso;
	private double altura;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Jogador(String n, double p, double a) { //bob o construtor :)
		System.out.println("CRIANDO OBJETO BANG BANG BANG BARULHOS DE MARTELO");
		nome= n;
		peso=p;
		altura=a;
	}
}