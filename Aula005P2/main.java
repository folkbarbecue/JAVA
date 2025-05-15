package atv5p2;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("Qual a questão que você quer selecionar?");
		Scanner tec = new Scanner(System.in);
        int v = tec.nextInt();
        if (v == 1) {
			quest1 texto = new quest1();
			texto.converter();
		} if (v == 2) {
			quest2 texto2 = new quest2();
			texto2.juros();
		} if (v == 3) {
			quest3 texto3 = new quest3();
			texto3.prod();
		}
	}

}
