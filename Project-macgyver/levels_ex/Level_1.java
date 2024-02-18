package levels_ex;

public class Level_1 {
	
	public static void road() {
		boolean key = true;
		if(key == true) {
			System.out.println("1 fase concluida com sucesso 🟢 \n.....Rodada de teste 2 sendo executada...");
			Level_2.road2();
		}
    };	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Macgyver executado com sucesso");
		road();
	}

}
