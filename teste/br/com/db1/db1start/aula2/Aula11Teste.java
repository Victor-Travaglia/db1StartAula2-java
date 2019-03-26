package br.com.db1.db1start.aula2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class Aula11Teste {
	
	@Test
	public void deveRetornarListaDeNomes() {
		
		Aula11 aula11 = new Aula11();
		
		List<String> nomes = aula11.nomes();
		
		Assert.assertEquals("Maiko", nomes.get(0));
		Assert.assertEquals("João", nomes.get(1));
	}
	
	@Test
	public void deveRetornarListaDeCores() {
		
		Aula11 aula11 = new Aula11();
		
		List<String> cores = aula11.cores();
		
		Assert.assertEquals("preto", cores.get(0));
		Assert.assertEquals("branco", cores.get(1));
	}
	
	@Test
	public void deveRetornarQuantidadeDeIntens() {
		
		Aula11 aula11 = new Aula11();
		List<String> itens = new ArrayList<String>();
		itens.add("item 1");
		itens.add("item 2");
		itens.add("item 3");
		
		Assert.assertEquals(3, aula11.quantidadeDeIntens(itens));
	}
	
	@Test
	public void deveIncluirTresItensRemoverUm() {
		
		Aula11 aula11 = new Aula11();
		List<String> itens = new ArrayList<String>();
		itens.add("item 1");
		itens.add("item 3");
		
		Assert.assertEquals(itens, aula11.adicionaStrings("item 1", "item 2", "item 3"));
	}
	
	@Test
	public void deveOrdenarUmaListaDeCores() {
		
		Aula11 aula11 = new Aula11();
		List<String> cores = new ArrayList<String>();
		cores.add("preto");
		cores.add("vermelho");
		cores.add("verde");
		cores.add("azul");
		cores.add("branco");
		
		Assert.assertEquals(cores, aula11.ordenarCores(cores));
	}
	
	@Test
	public void deveRemoverUmaCor() {
		
		Aula11 aula11 = new Aula11();
		List<String> cores = new ArrayList<String>();
		cores.add("preto");
		cores.add("vermelho");
		cores.add("verde");
		
		Assert.assertEquals(cores, aula11.removeCor(cores, "preto"));
	}
	
	@Test
	public void deveOrdenarUmaListaDeItens() {
		
		Aula11 aula11 = new Aula11();
		List<String> itens = new ArrayList<String>();
		itens.add("batata");
		itens.add("banana");
		itens.add("abacate");
		itens.add("uva");
		itens.add("pera");
		
		Assert.assertEquals(itens, aula11.ordenarItens(itens));
	}
	
	@Test
	public void deveRetornarUmaListaParImpar() {
		
		Aula11 aula11 = new Aula11();
		List<Integer> numeros = new ArrayList<Integer>();
		for(int i = 0; i <= 10; i++) {
			numeros.add(i);
		}
		
		Assert.assertNotEquals(numeros, aula11.listaDeParesImpares(numeros));
	}
	
	@Test
	public void deveRetornarUmalistaDeNomesSeparadosPelaInicial() {
		
		Aula11 aula11 = new Aula11();
		List<String> nomes = new ArrayList<String>();
		nomes.add("Maria");
		nomes.add("Ana");
		nomes.add("Roberval");
		nomes.add("Jose");
		nomes.add("Wagner");
		nomes.add("Ana Laura");
		nomes.add("Clecio");
		nomes.add("Rodolfo");
		nomes.add("José");
		nomes.add("Rodolpho");
		nomes.add("Marcos");
		nomes.add("Vagner");
		nomes.add("Joaldo");
		
		Assert.assertNotEquals(nomes, aula11.listaDeNomesSeparadosPelaInicial(nomes));
	}
	
	@Test
	public void deveRetornarListaSeparadaMap() {
		Aula11 aula11 = new Aula11();
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Maria");
		nomes.add("Ana");
		nomes.add("Roberval");
		nomes.add("Jose");
		nomes.add("Wagner");
		nomes.add("Ana Laura");
		nomes.add("Clecio");
		nomes.add("Rodolfo");
		nomes.add("José");
		nomes.add("Rodolpho");
		nomes.add("Marcos");
		nomes.add("Vagner");
		nomes.add("Joaldo");

		
		Map<String, List<String>> retorno = aula11.dividirPalavrasMap(nomes); 
		
		Assert.assertNotEquals(nomes, aula11.dividirPalavrasMap(nomes));
	}
	
	@Test
	public void deveRetornarSomaDeNumerosDeUmaLista() {
		
		Aula11 aula11 = new Aula11();
		List<Double> numeros = new ArrayList<Double>();
		numeros.add(2.0);
		numeros.add(4.0);
		numeros.add(6.0);
		
		Assert.assertEquals(4, aula11.mediaListaDeDouble(numeros), 0);
	}
	
	@Test
	public void deveRetornarMenorNumeroDaLista() {
		
		Aula11 aula11 = new Aula11();
		Integer numero = -20;
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(-20);
		numeros.add(50);
		
		Assert.assertEquals(numero, aula11.menorValorDaListaDeInteger(numeros), 0);
	}
	
	@Test
	public void deveRetornarMaiorNumeroDaLista() {
		
		Aula11 aula11 = new Aula11();
		Integer numero = 80;
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(80);
		numeros.add(-20);
		numeros.add(50);
		
		Assert.assertEquals(numero, aula11.maiorValorDaListaDeInteger(numeros), 0);
	}
	
	@Test
	public void deveRetornarUmaListaSemImpares() {
		
		Aula11 aula11 = new Aula11();
		List<Integer> numeros = new ArrayList<Integer>();
		for(int i = 0; i <= 10; i++) {
			numeros.add(i);
		}
		
		Assert.assertEquals(numeros, aula11.removerImparesDaListaDeInteger(numeros));
	}
}