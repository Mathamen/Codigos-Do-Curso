package Aula3;
public class Conta {
	private String nomeCliente;
	private double saldo;
	public boolean debitar(double valor) {
		if ((saldo-valor>0)) {
			saldo = saldo -valor;
			System.out.println("valor sacado: " + valor);
			System.out.println("saldo: " + saldo);
			return true;
			}
		else {
			System.out.println("Saque n�o realizado. Saldo: " + saldo + "tentativa de saque: " + valor);
			return false;
		}
	
	}
	public void depositar(double valor) {
		saldo+= valor;
	}
	public void setNomeCliente(String nc) {
		if (nc.length() <1 ) {throw new RuntimeException();}
		nomeCliente=nc;
	}
	public double getSaldo() {
	return saldo;	
	}
	
	}
