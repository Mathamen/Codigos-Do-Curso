package p2Ninja;
import java.util.*;
public class Academia {
	private String nome;
	private List<Ninja> listaNinjas; // ou List<Ninja>
	
	public List<Ninja> getListaNinjas() {
		return this.listaNinjas;
	}
	
	public void matriculaNinja(Ninja naruto) {
		this.listaNinjas.add(naruto);
	}
	
	public boolean imprimeDadosNinjaSeExistir(Ninja boruto) {
		if (this.listaNinjas.contains(boruto)){
			List copia= getListaNinjas();
			int a= copia.indexOf(boruto);
			Ninja clone= (Ninja)copia.get(a);
			System.out.println(clone.toString());
			return true;
		}
		return false;
	}
	public String getNome() {
		return this.nome;
	}



	public String toString(){
		List copia= getListaNinjas();
		int a= copia.size();
		return "Academia: " + getNome() + "Alunos: " + a;
	}



	public Academia (String nomeN) {
		this.nome=nomeN;
	}
	
}
