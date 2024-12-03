package estrutura_decisao;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

	public static void main(String[] args) {

		// Variaveis e scanner
		float media;
		Scanner leia = new Scanner(System.in);

		// Entrada
		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();

		// Processamento

		if (media >= 6) {

			// saida if
			System.out.println("Parabéns, você foi aprovadx!");

		} else if (media >= 5) {

			// saída else if
			System.out.println("Participante de Exame");
		} else {
			
			// saída else
			System.out.println("Infelizmente, você foi reprovadx.");
		}

		leia.close();
	}

}
