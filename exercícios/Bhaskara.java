package fundamentos.exerc�cios;

import java.util.Scanner;

// Criar um programa que resolve equa��es do segundo grau (ax2 + bx + c = 0)
// utilizando a f�rmula de Bhaskara.
// Use como exemplo a = 1, b = 12 e c = -13.
// Encontre o delta

public class Bhaskara {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Equa��o: ax� + bx + c = 0");
		
		System.out.print("\nInforme o valor de A: ");
		int a = scan.nextInt();
		System.out.print("\nInforme o valor de B: ");
		int b = scan.nextInt();
		System.out.print("\nInforme o valor de C: ");
		int c = scan.nextInt();
		
		double delta = Math.pow(b, 2) - 4*a*c;
		
		System.out.printf("\nDelta � igual a %.1f", delta);
		
		double x1 = -b + Math.sqrt(delta) / 2 * a;
		double x2 = -b - Math.sqrt(delta) / 2 * a;
		
		System.out.printf("\n\nResultado do x1 � %.1f e x2 � %.1f.", x1, x2);
//		System.out.println("\nResultado do x1 � " + x1 + " e x2 � " + x2 + "." );
		
		scan.close();
	}

}
