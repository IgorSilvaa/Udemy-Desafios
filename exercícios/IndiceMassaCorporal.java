package fundamentos.exerc�cios;

import java.util.Scanner;

// Criar um programa que leia o peso e a altura 
// do usu�rio e imprima no console o IMC.

public class IndiceMassaCorporal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu peso: ");
		double peso = scan.nextDouble();
		System.out.println("Informe sua altura: ");
		double altura = scan.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("Seu indice de massa corporal � %.1f kg/m�", imc);
		
		scan.close();
	}

}
