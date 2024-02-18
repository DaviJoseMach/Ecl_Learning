package levels_ex;
import java.util.Iterator;
import java.util.Scanner;


public class tester {

	public static void main(String[] args) {
		
		 tester tester = new tester();
	        tester.start();
	      }
	
	  public void start() {
		  Scanner scanner = new Scanner(System.in);
			double saldo = 150.43;
			int cr = 1240;
			
			//conv
			System.out.println("Bem vindo a area de teste;; \n Saldo atual é de: R$" + saldo + "\n Deseja proseguir com as etapas de verificação??");
			String opc = scanner.nextLine();
			
			if (opc.equalsIgnoreCase("sim")) {
				System.out.println("Rodando projeto Macgyver teste 1 em we01293104.");
				for (int i = 0; i < 3; i++) {
					System.out.println(i + "....");
				}
				Level_1.road();
				
			}
			else {
				System.out.println("Ocorreu um erro inesperado \n Insira o codigo de reinicialização:/:");
				
			}
			String crr = scanner.nextLine();
				if (crr.equals(String.valueOf(cr))) {
			    restart();			
			 } 
				else {
					System.out.println("Sua ultima chance foi esgotada; codigo de erro::Erro 403");
			}
	        restart();
	    }
	  
	  public void restart() {
	       
	        main(new String[]{});
	    }

}
