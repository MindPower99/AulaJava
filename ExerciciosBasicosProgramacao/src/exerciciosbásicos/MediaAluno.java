package exerciciosb�sicos;
import java.util.Scanner;

/* autor: Gabriel Jorge
	problema: Crie um algoritmo que receba
 	o nome  do aluno e suas 4 notas bimestrais,
 	calcule, apresente a m�dia anual e nome desse aluno,
 	e diga se ele foi aprovado, ficou de recupera��o ou reprovou.
*/ 

public class MediaAluno {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		double media, n1, n2, n3, n4;
		System.out.println("==========C�lculo de m�dia anual ==========\n");
		System.out.println("Digite seu nome: ");
		nome = input.nextLine();
		System.out.println("Digite a Primeira nota: ");
		n1 = input.nextDouble();
		System.out.println("Digite a Segunda nota: ");
		n2 = input.nextDouble();
		System.out.println("Digite a Terceira nota: ");
		n3 = input.nextDouble();
		System.out.println("Digite a Quarta nota: ");
		n4 = input.nextDouble();
		media = (n1 + n2 + n3 +n4) /4;
		
		if (media < 5) 
			System.out.printf("%s, sua m�dia anual � %.2f. Voc� foi reprovado. \n",nome,media);

		else if (media > 4 && media < 6) {
			System.out.printf("%s, sua m�dia anual � %.2f. Voc� ficou de recupera��o. \n",nome,media);
		}
		else 
			System.out.printf("%s, sua m�dia anual � %.2f. Voc� ficou de recupera��o. \n",nome,media);
	}

}
