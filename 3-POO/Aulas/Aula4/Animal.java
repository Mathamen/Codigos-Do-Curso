
public abstract class Animal {
	String nome;
	int idade;
	double peso;
	String cor;
	public Animal(String N){	
		nome=N;
	}
	public String toString() {
		return this.nome + " " + this.idade;
	}
	public abstract void correr();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
		
}
