package fundamentos.exercícios;

import java.util.Scanner;

// Criar um programa que leia a temperatura em Celsius
// e converta para Fahrenheit.

public class CelsiusParaFahrenheit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em °C: ");
		double celsius = scan.nextDouble();
		double fahrenheit = celsius * 1.8 + 32;
		
		System.out.printf("A temperatura em °F é %.1f°F", fahrenheit);
		
		scan.close();
	}

}
