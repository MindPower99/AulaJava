package exerciciosb�sicos;
import java.util.Scanner;
/*
 * autor: Gabriel Nascimento
 * 		problema: Criar um programa que recebe
 *  	uma senha, e se for 'asdfg', retorne
 *   	'senha v�lida'.
 *   	 Caso contr�rio retorne senha inv�lida
 *   	Dificultando: Crie um programa que registre uma senha,
 *   	 pe�a ela e verifique se est� correto.
 */
public class ValidarSenha {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String se;
		String senha;
		System.out.println("========= Valida��o de Senha: =========");
		System.out.println("Digite a senha: ");
		senha = input.next();
		System.out.println("Digite a senha novamente: ");
		se = input.next();
		
		
		if (!senha.equals(se)) {
			System.out.println("Senha inv�lida.");
		}
		
		else 
			System.out.println("Senha v�lida.");

	}

}
