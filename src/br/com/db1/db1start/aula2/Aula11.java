package br.com.db1.db1start.aula2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula11 {
	
	public List<String> nomes() {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Maiko");
		nomes.add("João");
		return nomes;
	}
	
	public List<String> cores() {
		List<String> cores = new ArrayList<String>();
		cores.add("preto");
		cores.add("branco");
		cores.add("vermelho");
		cores.add("azul");
		return cores;
	}
	
	public int quantidadeDeIntens(List<String> itens) {
		int contador = 0;
		for (String item : itens) {
			contador ++;
		}
		return contador;	
	}
	
	public List<String> adicionaStrings(String str1, String str2, String str3){
		List<String> palavra = new ArrayList<String>();
		palavra.add(str1);
		palavra.add(str2);
		palavra.add(str3);
		palavra.remove(1);
		return palavra;
	}
	
	public List<String> ordenarCores(List<String> cores){
		cores = new ArrayList<String>(cores);
		Collections.sort(cores);
		return cores;
	}
	
	public List<String> removeCor(List<String> cores, String cor) {
		cores = new ArrayList<String>(cores);
		cores.remove(cor);
		return cores;
	}
	
	public List<String> ordenarItens(List<String> itens) {
		itens = new ArrayList<String>(itens);
		Collections.sort(itens);
		Collections.reverse(itens);
	
		return itens;
	}
	
	public List<List<Integer>> listaDeParesImpares(List<Integer> numeros) {
		numeros = new ArrayList<Integer>(numeros);
		List<Integer> impares = new ArrayList<Integer>();
		List<Integer> pares = new ArrayList<Integer>();
		for (Integer num : numeros) {
			if(numeros.get(num) % 2 == 0) {
				pares.add(numeros.get(num));
			}
			else {
				impares.add(numeros.get(num));
			}
		}
		List<List<Integer>> parImpar = new ArrayList<List<Integer>>();
		parImpar.add(impares);
		parImpar.add(pares);
		return parImpar;
	}
	
	/*public List<List<String>> listaDeNomesSeparadosPelaInicial(List<String> nomes) {
		nomes = new ArrayList<String>(nomes);
		List<String> a = new ArrayList<String>();
		List<String> c = new ArrayList<String>();
		List<String> j = new ArrayList<String>();
		List<String> m = new ArrayList<String>();
		List<String> r = new ArrayList<String>();
		List<String> w = new ArrayList<String>();
		for (String nome : nomes) {
		}	
	}
	*/
	
}
