package ecl_learning;
import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		
		//numericos
			Random random = new Random();
			
			int numeroInt = random.nextInt(); 
			
			int numeroIntC = random.nextInt(100);
		
		//com char
		
			String conjuntoCaracteres = "abcdefghijklmnopqrstuvwxyz";
	     	int indiceAleatorio = random.nextInt(conjuntoCaracteres.length());

	        // Obter o caractere correspondente ao índice aleatório
	        char caracterAleatorio = conjuntoCaracteres.charAt(indiceAleatorio);

	        System.out.println("Caractere Aleatório: " + caracterAleatorio);

	}

}
