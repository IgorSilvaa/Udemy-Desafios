package fundamentos.exercícios;

import java.util.Scanner;

// Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
// utilizando a fórmula de Bhaskara.
// Use como exemplo a = 1, b = 12 e c = -13.
// Encontre o delta

public class Bhaskara {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Equação: ax² + bx + c = 0");
		
		System.out.print("\nInforme o valor de A: ");
		int a = scan.nextInt();
		System.out.print("\nInforme o valor de B: ");
		int b = scan.nextInt();
		System.out.print("\nInforme o valor de C: ");
		int c = scan.nextInt();
		
		double delta = Math.pow(b, 2) - 4*a*c;
		
		System.out.printf("\nDelta é igual a %.1f", delta);
		
		double x1 = -b + Math.sqrt(delta) / 2 * a;
		double x2 = -b - Math.sqrt(delta) / 2 * a;
		
		System.out.printf("\n\nResultado do x1 é %.1f e x2 é %.1f.", x1, x2);
//		System.out.println("\nResultado do x1 é " + x1 + " e x2 é " + x2 + "." );
		
		scan.close();
	}

}
