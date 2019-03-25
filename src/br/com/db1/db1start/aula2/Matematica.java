package br.com.db1.db1start.aula2;

public class Matematica {
	
	public double menorDois(double numero1, double numero2) {
		if (numero1 < numero2) {
			return  numero1;
		}
		else {
			return numero2;
		}
	}
	
	public double menorTres(double numero1, double numero2, double numero3) {
		if (numero1 < numero2 && numero1 < numero3) {
			return numero1;
		}
		else if (numero2 < numero3) {
			return numero2;
		}
		else {
			return numero3;
		}
	}
	
	public double mediaTresNumeros(double numero1, double numero2, double numero3) {
		return numero1 + numero2 + numero3 / 3;
	}
	
	public double areaTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}
}
