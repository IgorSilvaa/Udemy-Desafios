package controle.exercicios;

import java.util.Scanner;

// 1. Criar um programa que receba um número e 
//    verifique se ele está entre 0 e 10 e é par;

public class Questao1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Insira um número: ");
		int num = scan.nextInt();

		if (num >= 0) {
			if (num <= 10) {
				if (num % 2 == 0) {
					System.out.printf("O número %d é par e esta entre 0 e 10.", num);

				} else {
					System.out.println("Número impar!");
				}
			}
		}
		if (num > 10 || num < 0) {
			System.out.println("Número inválido!");
		}

		scan.close();

	}

}
