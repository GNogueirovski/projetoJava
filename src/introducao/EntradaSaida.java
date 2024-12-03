package introducao;

import java.util.Scanner; //importando a scanner

public class EntradaSaida {

	public static void main(String[] args) {
	// Variaveis
	String nome;
	float temperatura;
	float fahrenheit;
	
	// Puxando o scanner
	Scanner leia = new Scanner(System.in);
	
		
	//Entrada de dados - Pedir/Inserir o nome, temperatura
	System.out.println("Insira o seu nome: ");
	nome = leia.nextLine();
	
	System.out.println("Insira a temperatura em Celsius: ");
	temperatura = leia.nextFloat();
	

	
	// Processamento
	fahrenheit = temperatura * 1.8f + 32;
			
	// Saída de dados
	System.out.println("Bom dia, Magnata " + nome);	// concatenação

	System.out.printf("A temperatura em Fahrenheit é %.1f", fahrenheit);	
	
	leia.close();

	}

}
