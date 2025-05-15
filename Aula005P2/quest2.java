package atv5p2;
import java.util.Scanner;


public class quest2 {
	Scanner tec = new Scanner(System.in);
     public void juros() {
    	 System.out.println("Insira o valor depositado");
    	 double valr = tec.nextDouble();
    	 double juros = valr+(valr*0.0007);
    	 System.out.println("O valor com rendimento de UM mes é: " +juros);
     }
}
