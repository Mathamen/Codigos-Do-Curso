package Tarefa1;
import java.util.*;
import java.io.*;
public class ProgramaPrincipal {

	public static void main(String[] args) {
		ArrayList<String> listaData = new ArrayList<String>();
		ArrayList<String> listaLexs = new ArrayList<String>();
		try{
		listaData = Utils.importarCSV();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		listaData= Utils.retornaPalavras(listaData);
		HashMap<String,Integer> mapaDataSet= Utils.repeticoes(listaData);
		LinkedHashMap<String,Integer> mapaOrganizadoDataSet=Utils.organizaMapa(mapaDataSet);
		
		try {
		listaLexs = Utils2.importarLexico();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		LinkedHashMap<String,Integer> comLex= new LinkedHashMap<String,Integer> ();
		comLex= Utils2.retornaLexNoTexto(listaLexs, mapaOrganizadoDataSet);
		Utils.organizaMapa(comLex);
		Utils.imprimeMapa(mapaOrganizadoDataSet, 100, "100 mais comuns do dataset");
		Utils.imprimeMapa(comLex, 20, "20 mais comuns com os lexos");
		
		
	}
	

}
