package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		int resultado = somar(2,5);
		
		System.out.println("O primeiro resultado é: " + resultado);
		System.out.println("O segundo resultado é " + somar(3,4));
		
		falar("Pode ser, bom dia!");
		falar ("O gato dourado!");
		
		ExemploMetodoExterno.mensagem();
		
	}
	
	// Definição do Método Somar - Método com retorno e com Parametro
	public static int somar(int n1, int n2) {
		return n1 + n2;
		
	}
	// Definição do Método falar - Método sem retorno e com parametro
	public static void falar(String mensagem) {
		System.out.println(mensagem);
		
	}

}
