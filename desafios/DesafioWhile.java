package desafios;

import java.util.Scanner;

// Calcular media de alunos de uma turma
// Não sabe a quantidade de alunos
// Se a nota for valida, armazenar a soma de todas as
// notas e quantas notas foram validas.
// Para sair precisa digitar -1.

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double somaNotaValida = 0;
		int totalNotas = 0;
		double nota = 0;

		while (nota != -1) {
			System.out.print("Informe a nota: ");
			nota = scan.nextDouble();

			if (nota >= 0 && nota <= 10) {
				somaNotaValida = nota + somaNotaValida;
				totalNotas++;
				System.out.println("Informe outra nota ou digite '-1' para sair! ");
			} else if(nota != -1) {
				System.out.println("Informe uma nota válida! (0 a 10)");
			}
		}

		System.out.println("\nA soma das notas é igual a " + somaNotaValida);
		System.out.println("\nTotal de notas válidas " + totalNotas);

		double media = somaNotaValida / totalNotas;

		System.out.println("\nMédia das notas da turma: " + media);

		scan.close();
	}

}
