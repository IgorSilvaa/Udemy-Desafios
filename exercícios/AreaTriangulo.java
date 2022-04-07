package fundamentos.exerc�cios;

import java.util.Scanner;

// Criar um programa que leia o valor da base e da altura de um tri�ngulo
// e calcule a �rea.

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
		
		System.out.printf("A �rea do tri�ngulo � %.2f cm�.", areaT);
		
		scan.close();
	}

}
