package controle.exercicios;

import java.util.Scanner;

// 2. Criar um programa informa se o ano
// atual é um ano bissexto;

public class Questao2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o ano: ");
		int ano = scan.nextInt();

		if (ano % 4 == 0) {
			if (ano % 100 == 0) {
				if (ano % 400 == 0) {
					System.out.println("Este ano é bissexto!");
				} else {
					System.out.println("Este ano não é bissexto!");
				}
			} else {
				System.out.println("Este ano não é bissexto!");
			}
		} else {
			System.out.println("Este ano não é bissexto!");
		}

		scan.close();
	}

}
