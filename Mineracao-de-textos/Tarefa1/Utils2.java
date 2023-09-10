package Tarefa1;
import java.io.*;
import java.util.*;


public class Utils2 {

	/**
	 @author Matheus Amaral
	 @return retorna um ArrayList String que sera e obtido através de um arquivo TXT sobre os lexicos trabalhados
	 @throws IOException
	
	*/
	
public static ArrayList<String> importarLexico() throws IOException {
	String nomeArquivo= "Depress-pr-br.txt";
    ArrayList<String> linhas = new ArrayList<>();

    try (InputStream inputStream = Utils2.class.getResourceAsStream(nomeArquivo)) {
        if (inputStream != null) {
            BufferedReader leitor = new BufferedReader(new InputStreamReader(inputStream));
            String linha;
            while ((linha = leitor.readLine()) != null) {
            	linha =linha.toLowerCase();
                linhas.add(linha);
            }
            leitor.close();
        } else {
            System.out.println("Arquivo não encontrado.");
        }
    }

    return linhas;
}
	

	/**
	@author Matheus Amaral
	@return retorna um LinkedHashMap, organizado por frequencia de strings que aparecem em um outro Map de DataSet
	@param listaLexs e a lista de léxicos com que você pretende trabalhar
	@param mapaPalavras e o mapa que vem de um DataSet de palavras com a quantidade que aparecem

	 */
	

	public static LinkedHashMap<String, Integer> retornaLexNoTexto(ArrayList<String> listaLexs, Map<String,Integer> mapaPalavras){
		Iterator<String> it= listaLexs.iterator();
		LinkedHashMap<String, Integer> temp= new LinkedHashMap<String,Integer>();
		while(it.hasNext()) {
			String s= it.next();
			if(mapaPalavras.containsKey(s)) {
				temp.put(s,mapaPalavras.get(s));
			}
				
		}
		
		LinkedHashMap<String,Integer> retorno = new LinkedHashMap<String,Integer>();
		retorno =Utils.organizaMapa(temp);
		
		return retorno;
	}
	
	
}