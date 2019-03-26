package br.com.db1.db1start.aula2;

public class Inteiro {
	
	public int somarNumeros(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtrairNumeros(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiplicarNumeros(int num1, int num2) {
		return num1 * num2;
	}
	
	public int dividirNumeros(int num1, int num2) {
		return num1 / num2;
	}
	
	public boolean numeroPar(int num) {
		if (num % 2 == 0) {
			return true; 
		}
		else {
			return false;
		}
	}
	
	public int imparesAteCem(int num) {
		int contador = 0;
		for (int i = num; i <= 100; i++) {
			if (i % 2 != 0) {
				contador ++;
			}
		}
		return contador;
	}
}
