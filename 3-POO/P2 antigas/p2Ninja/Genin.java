package p2Ninja;

public class Genin extends Ninja implements Treinamento{
	public void treinar() {
		System.out.println("Genin " + this.getNome() + " iniciando treinamento");
	}
	
	
	
	
	
	
	
	
	
	public Genin(String cpfN, String nomeN, int idadeN) {
		super(cpfN,nomeN,idadeN);
	}
	public Genin(String cpfN) {
		super(cpfN);
	}
}
