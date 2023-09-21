package Tarefa1;
import java.util.*;
import java.io.*;
import java.nio.*;


public class Utils {
	
	
	
	
	/**
	 @author Matheus Amaral
	 @return retorna um ArrayList String que sera e obtido através de um arquivo CSV
	
	*/
	public static ArrayList<String> importarCSV() throws IOException {
        String nomeArquivo = "youtube_depress.csv";
        ArrayList<String> dados = new ArrayList<>();

        try (InputStream inputStream = Utils.class.getResourceAsStream(nomeArquivo)) {
            if (inputStream != null) {
                BufferedReader leitor = new BufferedReader(new InputStreamReader(inputStream));
                String linha;
                while ((linha = leitor.readLine()) != null) {
                    linha = linha.toLowerCase();
                	dados.add(linha);
                }
                leitor.close();
            } else {
                System.out.println("Arquivo não encontrado.");
            }
        }

        return dados;
    }

	
	
	/**
	 *
	 * Esta classe e responsavel por fazer alteraçoes em uma string para depois usar para analizar o conteudo, sem pontuaçao
	 * @author Matheus Amaral
	 * @param s e uma string que vai ter pontuação, acentos e sinais graficos removidos.
	 * @return e a mesma string sem esses elementos que podem atrapalhar a mineração de dados
	 * 
	 * 
	 */
	public static String limpaString(String s) {
		s= s.toLowerCase();
		s= s.replace(',', ' ');
		s= s.replace('.', ' ');
		s= s.replace('?', ' ');
		s= s.replace('!', ' ');
		s= s.replace('\\', ' ');
		s= s.replace('/', ' ');
		s= s.replace('(', ' ');
		s= s.replace(')', ' ');
		s= s.replace('-', ' ');
		s= s.replace(';', ' ');
		s= s.replace('"', ' ');
		s= s.replaceAll("\\s+", " ");
		return s;
	}
	
	
	
	/**
	 @author Matheus Amaral
	 @param s e uma string que sera dividida pelos espaços que possui
	 @param lista é o arrayList original
	 @return e a lista original com as palavras separadas da string s
	
	*/
	public static ArrayList<String> picotaString(String s, ArrayList<String> lista){ 
		String[] aux= s.split(" ");
		for (int i=0; i<aux.length; i++) {
			lista.add(aux[i]);
			if (aux[i] == "")
				lista.remove(aux[i]);
		}
		return lista;
	}
	
	
	
	/**
	 @author Matheus Amaral
	 @param primitivo e um conjunto de strings que ainda nao foram tratadas
	 @return e um ArrayList String que contem as palavras ja tratadas 
	*/
	public static ArrayList<String> retornaPalavras(ArrayList<String> primitivo){
		ArrayList<String> retorno= new ArrayList<String>();
		String s;
		for (int i=0; i< primitivo.size(); i++){
			s= primitivo.get(i);
			s= Utils.limpaString(s);
			Utils.picotaString(s,retorno);
		}
		
		return retorno;
	}
	
	
	
	/**
	 @author Matheus Amaral
	 @param primitiva e um ArrayList de strings que sera processado
	 @return retorna um HashMap do tipo String,Integer, onde a String sao as palavras e Integer a quantidade de vezes que se repete
	
	*/
	public static HashMap<String,Integer> repeticoes(ArrayList<String> primitiva){
		HashMap<String,Integer> mapa = new HashMap<String,Integer>();
		Iterator<String> it= primitiva.iterator();
		while (it.hasNext()) {
			String aux = it.next();
			if (mapa.get(aux)== null) {
				mapa.put(aux,1);
			}else{
				int qtd =mapa.get(aux);
				qtd++;
				mapa.replace(aux, qtd);
			}
		}
		return mapa;
	}
	
	
	
	/**
	 @author Matheus Amaral
	 @param mapaBaguncado w um mapa inicial que depois sera arrumado
	 @return retorna um LinkedHashMap String,Integer ordenado a partir das Integers, de maior para menor
	
	*/
	public static LinkedHashMap<String,Integer> organizaMapa(Map<String,Integer> mapaBaguncado){
        List<Map.Entry<String, Integer>> listaEntradas = new ArrayList<>(mapaBaguncado.entrySet());
       
        Collections.sort(listaEntradas, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> entrada1, Map.Entry<String, Integer> entrada2) {
                return entrada2.getValue().compareTo(entrada1.getValue());
            }
        	});

        // Criando um novo LinkedHashMap para manter a ordem da ordenação
        LinkedHashMap<String, Integer> mapaOrdenado = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entrada : listaEntradas) {mapaOrdenado.put(entrada.getKey(), entrada.getValue());}
        return mapaOrdenado;
	}
	
	/**
	 @author Matheus Amaral
	 @param mapa , um mapa que quer imprimir
	 @param limiteImpressao ,um int que é um limite para o print, se desejar
	 @param flavor ,uma string que é a mensagem que deseja que apareça antes do print
	*/
	
	
	public static void imprimeMapa(Map<String,Integer> mapa, int limiteImpressao, String flavor) {
		System.out.println("\n \n \n" + flavor);
        int contador=0;
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + "- " + entrada.getValue());
            if (contador < imiteImpressao) break;
            contador++;
        }
	}
	
	
	
	
	
	
	
}
