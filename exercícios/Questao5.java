package controle.exercicios;

import java.util.Scanner;

// 5- Refatorar o exercício 04,
//    utilizando a estrutura switch.
 
public class Questao5 {
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
		
		switch (contadorDeDivisores) {
		case 0:
			System.out.println("Este número é primo!");
			break;
		default:
			System.out.println("Este número não é primo!");
		}
		
		scan.close();
	}

}
