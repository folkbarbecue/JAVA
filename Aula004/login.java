package atv2;
import java.util.Scanner;


public class login {
	public String email;
	public String senha;
    public void login() {
		Scanner tec = new Scanner(System.in);
		System.out.println("INSIRA O SEU EMAIL PARA COMEÇAR O CADASTRO");
		email = tec.nextLine();
		System.out.println("CRIE UMA SENHA PARA SEU CADASTRO");
		senha = tec.nextLine();
	cad();
    } public void cad() {
    	int t = 0;
		Scanner tec = new Scanner(System.in);
    	System.out.println("INICIANDO O LOGIN...");
    	System.out.println("INSIRA SEU EMAIL JÁ CADASTRADO");
    	String e = tec.nextLine();
    	if (e.equals(email)) {
			System.out.println("AGORA INSIRA SUA SENHA");
			String s = tec.nextLine();
			if (s.equals(senha)) {
           comprar texto1 = new comprar();
           texto1.inicio();
			} else {
				t = t+1;
				System.out.println("Email ou senha incorretos");
				if (t == 3) {
					System.out.println("Acesso negado");
					
				}
				cad();
			}
		}
    }
}
