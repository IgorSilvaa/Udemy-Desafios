package fundamentos.exercícios;

import java.util.Scanner;

// Criar um programa que leia a temperatura em Fahrenheit
// e converta para Celsius.

public class FahrenheitParaCelsius {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em °F: ");
		double fahrenheit = scan.nextDouble();
		double celsius = (fahrenheit - 32) / 1.8;
		
		System.out.printf("Temperatura em °C é: %.1f°C", celsius);
		
		scan.close();
	}

}
