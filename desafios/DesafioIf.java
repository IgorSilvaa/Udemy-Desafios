package desafios;

// Onde est� o bug?

public class DesafioIf {
	public static void main(String[] args) {

		double nota = 1.3;

// Linha 13 o ";" ap�s o parentese do if finalizou e as chaves � um novo bloco.
// Corre��o na linha 14.

//		if(nota >= 9.0); { 
		if (nota >= 9.0) {
			System.out.println("Quadro de Honra!");
			System.out.println("Voc� � fera!!!");
		}
	}

}
