package p2Ninja;

public class Jonin extends Ninja implements Treinamento{
	
	public void treinar() {
		System.out.println("Jonin " + this.getNome()+ " iniciando treinamento avançado" );
	}
	
	
	
	
	public Jonin(String cpfN, String nomeN, int idadeN) {
		super(cpfN,nomeN,idadeN);
	}
	public Jonin(String cpfN) {
		super(cpfN);
	}
	
	
	
}
