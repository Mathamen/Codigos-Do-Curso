package p2Ninja;

public class Ninja implements Treinamento{
	private String cpf;
	private String nome;
	private int idade;
	
	public String getCpf() {
		return this.cpf;
	}
	
	
	
	public void setNome(String nomeN) {
		this.nome=nomeN;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int idadeN) {
		this.idade = idadeN;
	}
	public int getIdade() {
		return this.idade;
	}
	
	
	
	
	public void treinar() {
		
	}
	
	public boolean equals (Object o) {
		if (o instanceof Ninja ) {
			Ninja ab = (Ninja) o;
			return this.cpf.equals( ab.getCpf() );
		}
		return false;
	}
	public Ninja(String cpfN, String nomeN, int idadeN) {
		this.cpf = cpfN;
		this.nome= nomeN;
		this.idade=idadeN;
	}
	
	public Ninja(String cpfN) {
		this.cpf= cpfN;
	}
	public String toString(){
		return "cpf do ninja: " + this.cpf + "nome do ninja: " + this.nome + "idade do ninja: " + this.idade;
	}
}
