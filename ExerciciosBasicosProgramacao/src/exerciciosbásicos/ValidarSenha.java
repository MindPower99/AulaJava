package exerciciosbásicos;
import java.util.Scanner;
/*
 * autor: Gabriel Nascimento
 * 		problema: Criar um programa que recebe
 *  	uma senha, e se for 'asdfg', retorne
 *   	'senha válida'.
 *   	 Caso contrário retorne senha inválida
 *   	Dificultando: Crie um programa que registre uma senha,
 *   	 peça ela e verifique se está correto.
 */
public class ValidarSenha {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String se;
		String senha;
		System.out.println("========= Validação de Senha: =========");
		System.out.println("Digite a senha: ");
		senha = input.next();
		System.out.println("Digite a senha novamente: ");
		se = input.next();
		
		
		if (!senha.equals(se)) {
			System.out.println("Senha inválida.");
		}
		
		else 
			System.out.println("Senha válida.");

	}

}
