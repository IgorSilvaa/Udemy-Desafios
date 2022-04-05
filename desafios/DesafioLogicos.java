package desafios;

// Trabalho na terça (V ou F);
// Trabalhoo na quinta (V ou F);
// Se derem certo os dois trabalhos vai ao Shopping comprar TV 50";
// Se apenas 1 der certo vai comprar uma TV de 32";
// Se for comprar a tv independente de qual seja vai tomar sorvete;
// Se ambos derem errado todo mundo fica em casa.

public class DesafioLogicos {
	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//Operador Unário!
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouTV32);
		
		
		System.out.println("Mais saudável? " + maisSaudavel);
	}

}
