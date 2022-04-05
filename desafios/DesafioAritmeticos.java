package desafios;

// Resolução de uma equação Desafio Udemy Cursos.

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		double eq1 = (6 * (3 + 2));
		double eq2 = 3 * 2;
		double el1 = Math.pow(eq1, 2); // "Math.pow" - elevar um qualquer número.
		double resultEq1 = el1 / eq2;
		
		System.out.println("Resultado equação 1: " + resultEq1);
		
		double eq3 = ((1-5) * (2 - 7)) / 2;
		double resultEq2 = Math.pow(eq3, 2);
		
		System.out.println("Resultado equação 2: " + resultEq2);
		
		double resultCima = resultEq1 - resultEq2;
		double partCima = Math.pow(resultCima, 3);
		
		double resultFinal = partCima / Math.pow(10, 3);
		
		System.out.println("Resultado da expressão é: " + resultFinal);
	}

}
