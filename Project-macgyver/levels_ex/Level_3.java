package levels_ex;
import java.util.Random;
import java.util.Scanner;
import java.util.Iterator;

public class Level_3 {

	public static void road3() {
		
		Scanner scanner = new Scanner(System.in);
		  
		System.out.println("Iniciando CaPcHa numerico...");
		String senha = gerarSenhaNumerica(5);
        System.out.println("RESCREVA O SEGUINTE CODIGO::> " + senha);
        
        String sn = scanner.nextLine();
        
        if(sn.equals(String.valueOf(senha))) {
        	System.out.println("Aprovado pelo CaPcHa;; estamos te redirecionando;;");
        }
        else {
        	System.out.println("Você é um robo??? ");
        }
       
        
		
		
	}
	
	  public static String gerarSenhaNumerica(int comprimento) {
	        StringBuilder senha = new StringBuilder();

	        Random random = new Random();
	        for (int i = 0; i < comprimento; i++) {
	            int digito = random.nextInt(10); // Gera um número aleatório de 0 a 9
	            senha.append(digito);
	        }

	        return senha.toString();
	    }
	
	public static void main(String[] args) {
	

	}

}
