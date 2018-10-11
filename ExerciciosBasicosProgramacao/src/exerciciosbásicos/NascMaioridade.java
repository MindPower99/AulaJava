package exerciciosbásicos;
import java.util.Scanner;

public class NascMaioridade {

	public static void main(String[] args) {
		int anonasc, idade, anoatual;
		Scanner input = new Scanner(System.in);
		System.out.println("========== Programa que calcula maioridade ========");
		System.out.println("Digite seu ano de nascimento: ");
		anonasc = input.nextInt();
		System.out.println("Digite o ano atual: ");
		anoatual = input.nextInt();
		idade = anoatual - anonasc;
		
		if (idade < 18) {
			System.out.println("Não atingiu a maioridade: ");
		}
		else 
			System.out.println("Atingiu a maioridade ou atinge esse ano: ");
		
		

	}

}
