package estrutura_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {

		String nome;
		//int contador;
		Scanner leia = new Scanner(System.in);

		/*System.out.println("Digite o 1º nome: ");
		nome1 = leia.nextLine();
		System.out.println("O 1º nome é: " + nome1);

		System.out.println("\nDigite o 2º nome: ");
		nome2 = leia.nextLine();
		System.out.println("O 2º nome é: " + nome2);

		System.out.println("\nDigite o 3º nome: ");
		nome3 = leia.nextLine();
		System.out.println("O 3º nome é: " + nome3);*/
		
		for (int contador = 1 ; contador < 4; contador ++) {
			System.out.printf("\nDigite o %dº nome: ", contador);
			nome = leia.nextLine();
			System.out.printf("O %dº nome é %s: ", contador,nome);	
		}
		
		
		leia.close();
	}

}
