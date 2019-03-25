package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;

public class TextoTeste {
	
	@Test
	public void deveRetornarPalavraMaiuscula() {
		Texto texto = new Texto();
		
		String resultado0 = texto.maiusculas("db1start");
		
		Assert.assertEquals("DB1START", resultado0);
	}
	
	@Test
	public void deveRetornarPalavraMinuscula() {
		Texto texto = new Texto();
		
		String resultado0 = texto.minusculas("DB1START");
		
		Assert.assertEquals("db1start", resultado0);
	}
	
	@Test
	public void deveRetornarQuantidadeDeLetras() {
		Texto texto = new Texto();
		
		int resultado0 = texto.quantidadeLetras("db1start");
		
		Assert.assertEquals(8, resultado0);
	}
	
	@Test
	public void deveRetornarQuantidadeDeLetrasSemEspacos() {
		Texto texto = new Texto();
		
		int resultado0 = texto.quantidadeLetrasSemEspaco(" db1start ");
		
		Assert.assertEquals(8, resultado0);
	}
	
	@Test
	public void deveRetornarPartindoDasPrimeiasQuatroLetras() {
		Texto texto = new Texto();
		
		String resultado0 = texto.partindoDasQuatroPrimeirasLetras("victor lopes travaglia");
		
		Assert.assertEquals("tor lopes travaglia", resultado0);
	}
	
	@Test
	public void deveRetornarAsUltimasQuatroLetras() {
		Texto texto = new Texto();
		
		String resultado0 = texto.ultimasQuatroLetras("victor lopes travaglia");
		
		Assert.assertEquals("glia", resultado0);
	}
	
	@Test
	public void deveRetornarPrimeiroNomeSubstituido() {
		Texto texto = new Texto();
		
		String resultado0 = texto.substituirPrimeiroNome("victor lopes travaglia");
		
		Assert.assertEquals("ALUNOlopestravaglia", resultado0);
	}
	
	@Test
	public void deveRetornarStringsSeparadas() {
		Texto texto = new Texto();
		
		String resultado0 = texto.separarStrings("banana, maça, melancia");
		
		Assert.assertEquals("banana maça melancia", resultado0);
	}
	
	@Test
	public void deveRetornarTotalDeVogais() {
		Texto texto = new Texto();
		
		int resultado0 = texto.contarVogais("db1start");
		
		Assert.assertEquals(1, resultado0);
	}
	
	@Test
	public void deveRetornarTextoInvertido() {
		Texto texto = new Texto();
		
		String resultado0 = texto.inverterString("db1start");
		
		Assert.assertEquals("trats1bd", resultado0);
	}
}
