package atv5;
import java.util.Scanner;

public class quest4 {
     public void emprestimo() {
			Scanner tec = new Scanner(System.in);
            System.out.println("Para solicitar o emprestimo antes, coloque o seu salário");
            double salario = tec.nextDouble();
            System.out.println("Qual o valor da prestação? ");
            double presta = tec.nextDouble();
            if (presta> (salario*0.15)) {
				System.out.println("Esse emprestimo não pode ser concebido");
			} else {
System.out.println("Esse emprestimo foi concluido");
			}
     }
}
