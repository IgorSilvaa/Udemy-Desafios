package fundamentos.exercícios;

import java.util.Scanner;

// Criar um programa que leia um valor e apresente os resultados 
// ao quadrado e ao cubo do valor.

public class Potencia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		double num = scan.nextDouble();
		
		double pQuadrado = Math.pow(num, 2);
		double pCubo = Math.pow(num, 3);
		
		System.out.printf("\nO %.1f ao quadrado é igual a %.1f e ao cubo é %.1f.",
				num, pQuadrado, pCubo);
		
		scan.close();
	}

}
