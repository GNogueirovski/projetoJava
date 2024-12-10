package metodos;

import java.util.Scanner;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		float numero1 = 0, numero2 = 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira o primeiro número do cálculo: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Insira o segundo número do cálculo: ");
		numero2 = leia.nextFloat();
		
		
		System.out.println("O resultado da soma é: " +Calculadora.soma(numero1, numero2));
		
		System.out.println("O resultado da soma é: " +Calculadora.subtracao(numero1, numero2));
		
		System.out.println("O resultado da soma é: " +Calculadora.divisao(numero1, numero2));
		
		System.out.println("O resultado da soma é: " +Calculadora.multiplicacao(numero1, numero2));
		
		leia.close();
		
	}
	


}
