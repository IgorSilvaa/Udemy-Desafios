package desafios;

import java.util.Scanner;

// Fazer um programa que calcule a média de 3 salários com tipo String.
// Independente se o usuário digitar com "." ou "," deve funcionar da mesma forma.
// Imprimir a média salarial no final.

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite primeiro salário: ");
		String valor1 = teclado.next().replace(",", ".");
				
		System.out.print("Digite segundo salário: ");
		String valor2 = teclado.next().replace(",", ".");
				
		System.out.print("Digite terceiro salário: ");
		String valor3 = teclado.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.printf("A média salarial é de R$ %.2f.", media);
		
		teclado.close();
	}

}
