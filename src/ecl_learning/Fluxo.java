package ecl_learning;

public class Fluxo {

	public static void main(String[] args) {
		// Estrutura condicional if-else
		
		int idade = 15;
		
		if (idade >= 18) {
		    System.out.println("Maior de idade");
		} else {
		    System.out.println("Menor de idade");
		}

		
		//----------------------
		
		
		// Estrutura de repetição for
		for (int i = 0; i < 5; i++) {
		    System.out.println(i);
		}

		// Estrutura de repetição while
		int contador = 0;
		while (contador < 3) {
		    System.out.println(contador);
		    contador++;
		}

	}

}
