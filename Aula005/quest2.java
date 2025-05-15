package atv5;
import java.util.Scanner;

public class quest2 {
   public void sal() {
		Scanner tec = new Scanner(System.in);
        System.out.println("Para começarmos, insira o seu salário base: ");
        double sb = tec.nextDouble();
        double imposto = sb*0.21;
        double gratificacao = sb*0.10;
        System.out.println("O valor do imposto que você vai pagar é: "+ imposto + " e o valor da gratificação que você vai receber é " + gratificacao);
        double total = (sb+gratificacao)-imposto;
        System.out.println("O salário total com imposto e gratificação é: "+total);
   }
}
