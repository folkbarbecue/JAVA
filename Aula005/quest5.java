package atv5;
import java.util.Scanner;

public class quest5 {
    public void hora() {
		Scanner tec = new Scanner(System.in);
       System.out.println("Insira a quantidade de horas trabalhadas no mês:");
       int hora = tec.nextInt();
       System.out.println("Insira quanto você recebe por hora:");
       double sph = tec.nextDouble();
       double ho = hora/4;
       if (ho>40) {
		double extra = ho-40;
		double salario40 = extra*sph;
		double total1 = salario40*4; 
		double ex = ho + extra*(sph*0.50);
		System.out.println("O salario total foi de "+ex);
	} else {
		double total = hora*sph;
		System.out.println("O salario total foi de: "+total);

	}
    }
}
