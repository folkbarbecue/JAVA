package atv5;
import java.util.Scanner;


public class quest3 {
	   public void idade() {
			Scanner tec = new Scanner(System.in);
            System.out.println("Primeiro, qual seu nome? ");
            String nome = tec.nextLine();
            System.out.println("Qual a sua idade?");
            int idade = tec.nextInt();
            if (idade>18) {
				System.out.println(nome+ ", sua entrada foi permitida");
			} else {
				System.out.println("Entrada negada, você é menor de idade");
			}
	   }
}
