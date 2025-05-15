package atv5;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Selecione qual a questão você gostaria de visualizar (De 1 a 6)");
		int v = tec.nextInt();
		if (v == 1) {
			quest1 texto = new quest1();
		    texto.converter();
		} if (v == 2) {
		    quest2 texto2 = new quest2();
		    texto2.sal();
		}if (v == 3) {
			quest3 texto3 = new quest3();
			texto3.idade();
		} if (v == 4) {
			quest4 texto6 = new quest4();
			texto6.emprestimo();
		} if (v == 5) {
			quest5 texto7 = new quest5();
			texto7.hora();
		} if (v == 6) {
			quest6 texto8 = new quest6();
			texto8.prod();
		}
	

		
	}

}
