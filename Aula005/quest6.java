package atv5;
import java.util.Scanner;

public class quest6 {
   public void prod() {
		Scanner tec = new Scanner(System.in);
System.out.println("Qual seu salario fixo");
double sf = tec.nextDouble();
System.out.println("Qual o valor de vendas total");
double vt = tec.nextDouble();
if (vt<=1500) {
	double st = sf+(vt*0.07);
	System.out.println("O salário total é: "+st);
	
} else {
	double sla = vt-1500;
	double sl = 1500 - vt;
	 double st = sf+((sla*0.03)+(sl*0.07));
	 System.out.println("O salário total é de: "+st);
}
   }
}
