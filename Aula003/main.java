package atv;
import java.util.Scanner;
 public class classe {

	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Selecione qual a questão você gostaria de visualizar (De 1 a 8)");
		int v = tec.nextInt();
		if (v == 3) {
			classe2 texto = new classe2();
		    texto.davi();
		} if (v == 4) {
		    classe3 texto3 = new classe3();
		    texto3.vinte();
		}if (v == 5) {
			classe5 texto5 = new classe5();
			texto5.conjunto();
		} if (v == 6) {
			classe6 texto6 = new classe6();
			texto6.azul();
		} if (v == 7) {
			classe7 texto7 = new classe7();
			texto7.volume();
		}if (v == 8) {
			classe8 texto8 = new classe8();
			texto8.money();
		}
	

		
	}

}
 