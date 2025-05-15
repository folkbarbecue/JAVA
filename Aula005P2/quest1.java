package atv5p2;
import java.util.Scanner;

public class quest1 {
    public void converter() {
    	Scanner tec = new Scanner(System.in);
        System.out.println("Insira o seu valor em reais");
        double reais = tec.nextDouble();
        double dolar = reais/5.68;
        System.out.println("O seu valor em dolar é: " + dolar);
  		
    }
}
