package ecl_learning;

public class Solo {

	public static void main(String[] args) {
		boolean famil_1 = true;
		int geration = 5;
		
		if(famil_1 == true && geration == 3) {
			System.out.println("Acesso ao painel de poder ilimitado concedido!");
		}
		else {
			System.out.println("Acesso negado; morte em");
			for(int i = 3; i > 0; i--) {
				System.out.println(i);
			}
		}
		
		
		System.out.println("Agora iremos utilizar de arrays para o mesmo mecanismo \n");
		// AGORA COM ARRAY
		
		int[]ger = {1, 2,3,4,5};
		int valorArray = ger[1]; //Aqui estamos selecionando o 2 valor do array (!) pois começa apartir do 0 = 1 1 = 2
		
		
		if(valorArray == 2 && famil_1 == true) {
			System.out.println("Acesso ao painel de poder ilimitado concedido!");
			
		}
		else {
			System.out.println("Acesso negado; morte em");
			for(int i = 3; i > 0; i--) {
				System.out.println(i);
			}
	}

	}}
