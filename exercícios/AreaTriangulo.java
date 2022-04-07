package fundamentos.exercícios;

import java.util.Scanner;

// Criar um programa que leia o valor da base e da altura de um triângulo
// e calcule a área.

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a altura do triangulo: ");
		String valor1 = scan.next().replace(",", ".");
		System.out.println("Informe a base do tringulo: ");
		String valor2 = scan.next().replace(",", ".");
		
		double altura = Double.parseDouble(valor1);
		double base = Double.parseDouble(valor2);
		double areaT = (base*altura)/2;
		
		System.out.printf("A área do triângulo é %.2f cm².", areaT);
		
		scan.close();
	}

}
