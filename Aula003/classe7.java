package atv;
import java.util.Scanner;

public class classe7 {

	public void volume() {
		Scanner tec = new Scanner(System.in);
        System.out.println("insira o valor do raio da base");
        double raio = tec.nextDouble();
        double pi = 3.14159;
        System.out.println("Insira a altura do cilindro");
        double h = tec.nextDouble();
        double volume = pi * (raio * raio) * h;
        System.out.println("O volume é igual a " + volume);
		
	}

}
