package br.com.db1.db1start.aula2;

import org.junit.Test;

import org.junit.Assert;

public class InteiroTeste {
	
	@Test
	public void deveRetornarNumero1SomadoAoNumero2() {
		Inteiro inteiro = new Inteiro();
		
		int resultado0 = inteiro.somarNumeros(1, 2);
		int resultado1 = inteiro.somarNumeros(3, 5);
		
		Assert.assertEquals(3, resultado0);
		Assert.assertEquals(8, resultado1);
	}
	
	@Test
	public void deveRetornarNumero1SubtraidoAoNumero2() {
		Inteiro inteiro = new Inteiro();
		
		int resultado0 = inteiro.subtrairNumeros(1, 2);
		int resultado1 = inteiro.subtrairNumeros(3, 5);
		
		Assert.assertEquals(-1, resultado0);
		Assert.assertEquals(-2, resultado1);
	}
	
	@Test
	public void deveRetornarNumero1MultiplicadoAoNumero2() {
		Inteiro inteiro = new Inteiro();
		
		int resultado0 = inteiro.multiplicarNumeros(2, 4);
		int resultado1 = inteiro.multiplicarNumeros(5, 3);
		
		Assert.assertEquals(8, resultado0);
		Assert.assertEquals(15, resultado1);
	}
	
	@Test
	public void deveRetornarUmNumeroPar() {
		Inteiro inteiro = new Inteiro();
		
		boolean resultado0 = inteiro.numeroPar(6);
		boolean resultado1 = inteiro.numeroPar(5);
		
		Assert.assertEquals(true, resultado0);
		Assert.assertEquals(false, resultado1);
	}
	
	@Test
	public void deveRetornarQuantidadeDeImparesAteCem() {
		Inteiro inteiro = new Inteiro();
		
		int resultado0 = inteiro.imparesAteCem(1);
		
		Assert.assertEquals(50, resultado0);
	}
}
