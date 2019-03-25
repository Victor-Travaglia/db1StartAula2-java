package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;

public class MatematicaTeste {
	
	@Test
	public void deveRetornarNumero1MenorQueNumero2() {
		Matematica comparador = new Matematica();
		double resultado0 = comparador.menorDois(20, 40);
		double resultado1 = comparador.menorDois(-30, 40);
		double resultado2 = comparador.menorDois(20, -50);
		
		Assert.assertEquals(20, resultado0, 0);
		Assert.assertEquals(-30, resultado1, 0);
		Assert.assertEquals(-50, resultado2, 0);
	}
	
	@Test
	public void deveRetornarMenorEntreTresNumeros() {
		Matematica comparador = new Matematica();
		double resultado0 = comparador.menorTres(20, 30, 50);
		double resultado1 = comparador.menorTres(-30, -20, 10);
		double resultado2 = comparador.menorTres(20, 30, -50);
		
		Assert.assertEquals(20, resultado0, 0);
		Assert.assertEquals(-30, resultado1, 0);
		Assert.assertEquals(-50, resultado2, 0);
	}
	
	@Test
	public void deveRetornarAreaDoTriangulo() {
		Matematica comparador = new Matematica();
		double resultado0 = comparador.areaTriangulo(3, 2);
		double resultado1 = comparador.areaTriangulo(5, 2);
		double resultado2 = comparador.areaTriangulo(8, 2);
		
		Assert.assertEquals(3, resultado0, 0);
		Assert.assertEquals(5, resultado1, 0);
		Assert.assertEquals(8, resultado2, 0);
	}
}
