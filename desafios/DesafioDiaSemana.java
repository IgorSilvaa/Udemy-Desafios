package desafios;

import java.util.Scanner;

// Domingo -> 1
// Segunda -> 2
// ter�a -> 3
// Quarta -> 4
// Quinta -> 5
// Sexta -> 6
// S�bado -> 7

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o dia da semana: ");
		String dia = scan.next().toLowerCase();
		
		if ("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		} else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		} else if ("ter�a".equalsIgnoreCase(dia)
				|| "terca".equalsIgnoreCase(dia) ) {
			System.out.println(3);
		} else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		} else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println(5);
		} else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println(6);
		} else if ("s�bado".equalsIgnoreCase(dia) 
				|| "sabado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		}
		
		scan.close();
		
	}

}
