package controle.exercicios;

import java.util.Scanner;

//4. Criar um programa que receba um número e
//   diga se ele é um número primo.

public class Questao4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int contadorDeDivisores = 0;

		System.out.print("Digite um numéro: ");
		int numero = scan.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nEste número é primo!");
		} else {
			System.out.println("\nEste número não é primo!");
		}

		scan.close();

	}

}
