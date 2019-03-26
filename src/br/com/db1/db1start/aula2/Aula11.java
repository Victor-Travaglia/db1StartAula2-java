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
	
	public List<List<String>> listaDeNomesSeparadosPelaInicial(List<String> nomes) {
		nomes = new ArrayList<String>(nomes);
		List<String> nomesA = new ArrayList<String>();
		List<String> nomesC = new ArrayList<String>();
		List<String> nomesJ = new ArrayList<String>();
		List<String> nomesM = new ArrayList<String>();
		List<String> nomesR = new ArrayList<String>();
		List<String> nomesW = new ArrayList<String>();
		List<List<String>> listaDeNomes = new ArrayList<List<String>>();
		for (String nome : nomes) {
			if(nome.charAt(0) == 'A') {
				nomesA.add(nome);
			}
			else if(nome.charAt(0) == 'C') {
				nomesC.add(nome);
			}
			else if(nome.charAt(0) == 'J') {
				nomesJ.add(nome);
			}
			else if(nome.charAt(0) == 'M') {
				nomesM.add(nome);
			}
			else if(nome.charAt(0) == 'R') {
				nomesR.add(nome);
			}
			else if(nome.charAt(0) == 'W') {
				nomesW.add(nome);
			}
		}
		Collections.sort(nomesA);
		Collections.sort(nomesC);
		Collections.sort(nomesJ);
		Collections.sort(nomesM);
		Collections.sort(nomesR);
		Collections.sort(nomesW);
		listaDeNomes.add(nomesA);
		listaDeNomes.add(nomesC);
		listaDeNomes.add(nomesJ);
		listaDeNomes.add(nomesM);
		listaDeNomes.add(nomesR);
		listaDeNomes.add(nomesW);
		return listaDeNomes;
	}
}
