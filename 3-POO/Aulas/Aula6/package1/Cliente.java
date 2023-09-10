package package1;

public class Cliente {
	private String cpf;
	private int idade;
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Cliente (String cpf) {
		setCpf(cpf);
	}
	
	public boolean equals(Object o) {
		if (o instanceof Cliente) {
			Cliente m= (Cliente)o;
			return m.cpf.equals(this.cpf);
		}
		return false;
	}
}
