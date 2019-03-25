package br.com.db1.db1start.aula2;

import java.util.ArrayList;
import java.util.List;
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
		
		Assert.assertNotEquals(cores, aula11.ordenarCores(cores));
	}
	
	@Test
	public void deveRemoverUmaCor() {
		
		Aula11 aula11 = new Aula11();
		List<String> cores = new ArrayList<String>();
		cores.add("preto");
		cores.add("vermelho");
		cores.add("verde");
		
		Assert.assertNotEquals(cores, aula11.removeCor(cores, "preto"));
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
		
		Assert.assertNotEquals(itens, aula11.ordenarItens(itens));
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
}