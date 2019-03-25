package br.com.db1.db1start.aula2;

public class Texto {
	
	public String maiusculas(String palavra) {
		return palavra.toUpperCase();
	}
	
	public String minusculas(String palavra) {
		return palavra.toLowerCase();
	}
	
	public int quantidadeLetras(String palavra) {
		int i;
		for (i = 0; i < palavra.length(); i++) {
			
		}
		return i;
	}
	
	public int quantidadeLetrasSemEspaco(String palavra) {
		int contador = 0;
		char caracter;
		for (int i = 0; i < palavra.length(); i++) {
			caracter = palavra.charAt(i);
			if (caracter == ' ') {
				contador --;
			}
			contador ++;
		}
		return contador;
	}
	
	public String primeirasQuatroLetras(String palavra) {
		String caracter = "";
		int i;
		for (i = 0; i < palavra.length(); i++) {
			if(i <= 3) {
				caracter += palavra.charAt(i);
			}
		}
		return caracter;
	}
	
	public String partindoDasQuatroPrimeirasLetras(String palavra) {
		String caracter = "";
		int i;
		for (i = 0; i < palavra.length(); i++) {
			if(i >= 3) {
				caracter += palavra.charAt(i);
			}
		}
		return caracter;
	}
	
	public String ultimasQuatroLetras(String palavra) {
		String caracter = "";
		int i;
		for (i = 0; i < palavra.length(); i++) {
			if(i >= palavra.length() - 4) {
				caracter += palavra.charAt(i);
			}
		}
		return caracter;
	}
	
	public String substituirPrimeiroNome(String palavra) {
		String[] novaPalavra = palavra.split(" "); 
		novaPalavra[0] = "ALUNO";
		String resultado = "";
		
		for(int i = 0; i < novaPalavra.length; i++) {
			resultado +=  novaPalavra[i];
		}
		
		return resultado;
	}
	
	public String separarStrings(String palavra) {
		String[] novaPalavra = palavra.split(","); 
		String banana = novaPalavra[0];
		String maca = novaPalavra[1];
		String melancia = novaPalavra[2];
		
		return banana.concat(maca).concat(melancia);
	}
	
	public int contarVogais(String palavra) {
        int contador = 0;
        palavra.toLowerCase();
        
        for (int i = 0; i < palavra.length(); i++){
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            	contador ++;
            }
        }
        return contador;
    }
	
	public String inverterString(String palavra) {
		String novaPalavra = "";
		for (int i = palavra.length() - 1; i >= 0; i--) {
			novaPalavra += palavra.charAt(i);
		}
		return novaPalavra;
	}
}