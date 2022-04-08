package desafios;

// Onde está o bug?

public class DesafioIf {
	public static void main(String[] args) {

		double nota = 1.3;

// Linha 13 o ";" após o parentese do if finalizou e as chaves é um novo bloco.
// Correção na linha 14.

//		if(nota >= 9.0); { 
		if (nota >= 9.0) {
			System.out.println("Quadro de Honra!");
			System.out.println("Você é fera!!!");
		}
	}

}
