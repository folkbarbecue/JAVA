package atv5;
import java.util.Scanner;


public class quest1 {
     
	public void converter() {
		Scanner tec = new Scanner(System.in);
System.out.println("Coloque uma grandeza em metros: ");
double metro = tec.nextDouble();
double cm = metro*100;
System.out.println("Sua grandeza em centímetros é: "+cm+"cm");

	}
}
