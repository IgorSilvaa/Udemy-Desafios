package controle.exercicios;

import java.util.Scanner;

//9. Crie um programa que recebe 10 valores e ao
//   final imprima o maior n�mero.

public class Questao9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numeroMaior = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %d� n�mero: ", i);
			int numero = scan.nextInt();
			if(numero > numeroMaior) {
				numeroMaior = numero;
			}
		}
		
		System.out.printf("O n�mero maior � %d.", numeroMaior);
		
		scan.close();
	}

}
