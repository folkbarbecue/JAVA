package atv5p2;

import java.util.Scanner;

public class quest3 {
	Scanner tec = new Scanner(System.in);
public void prod() {
	System.out.println("VOcê gostaria de colocar um produto[S = 1     N = 2]");
	int r = tec.nextInt();
	if (r ==1 ) {
		System.out.println("Qual o nome do produto?");
		String nomep = tec.nextLine();
		System.out.println("QUal o valor do produto?");
		double preco = tec.nextDouble();
		System.out.println("Parece que houve um aumento no produto, o valor com o aumento é: "+ (preco+(preco*0.55)));
	} else {
System.out.println("Olhe os produtos antes do aumento: ");
double acucar = 4.99;
double banha = 10.90;
double batatai = 1.70;
double batadad = 3.98;
double biscoitop = 6.70;
double bolachad = 5.69;
double bolachas = 3.50;
double cafe = 8.60;
System.out.println("AÇUCAR " + acucar);
System.out.println("Banha " + banha);
System.out.println("Batata inglesa " + batatai);
System.out.println("Batata doce " + batadad);
System.out.println("Biscoito polvilho " + biscoitop);
System.out.println("Bolacha maizena " + bolachad);
System.out.println("Bolacha salgada " + bolachas);
System.out.println("Cafe " + cafe);
System.out.println("Agora, os valores depois do aumento é: ");
 acucar = acucar +4.99*0.55;
 banha =banha +10.90*0.55;
 batatai = batatai+1.70*0.55;
 batadad = batadad+3.98*0.55;
 biscoitop =biscoitop +6.70*0.55;
 bolachad =bolachad +5.69*0.55;
 bolachas =bolachas +3.50*0.55;
 cafe = cafe +8.60*0.55;
 System.out.println("AÇUCAR " + acucar);
 System.out.println("Banha " + banha);
 System.out.println("Batata inglesa " + batatai);
 System.out.println("Batata doce " + batadad);
 System.out.println("Biscoito polvilho " + biscoitop);
 System.out.println("Bolacha maizena " + bolachad);
 System.out.println("Bolacha salgada " + bolachas);
 System.out.println("Cafe" + cafe);
	}
}

}
