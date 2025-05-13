package atv;
import java.util.Scanner;


public class classe8 {

	public void money() {
		Scanner tec = new Scanner(System.in);
      System.out.println("Insira o seu valor em reais");
      double reais = tec.nextDouble();
      double ienes = reais * 26.04;
      double dolar = reais/5.68;
      System.out.println("O seu valor em dolar é? " + dolar);
      System.out.println("O seu valor em ienes é? " + ienes);
		
	}

}
