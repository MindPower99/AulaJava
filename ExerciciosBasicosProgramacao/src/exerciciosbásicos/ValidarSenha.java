package exerciciosb�sicos;
import java.util.Scanner;

public class ValidarSenha {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String se = "asdfg";
		String senha;
		System.out.println("========= Valida��o de Senha: =========");
		System.out.println("Digite a senha: ");
		senha = input.next();
		
		if (!senha.equals(se)) {
			System.out.println("Senha inv�lida.");
		}
		
		else 
			System.out.println("Senha v�lida.");

	}

}
