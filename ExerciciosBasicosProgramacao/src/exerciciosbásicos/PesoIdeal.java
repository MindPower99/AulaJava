package exerciciosbásicos;
import java.util.Scanner;

public class PesoIdeal {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		double altura,pesoid;
		String nome;
		int sexo;
		System.out.println("Digite sua altura: ");
		altura = input.nextDouble();
		System.out.println("Digite seu nome: ");
		nome = input.next();
		System.out.println("Digite seu sexo \n 1 - Masculino \n 2 - Feminino ");
		sexo = input.nextInt();
		if (sexo == 1) {
			pesoid = (72.7 * altura) - 58;
			System.out.printf("%s, seu peso ideal é %.2f kg \n",nome,pesoid);
		}
		else {
			pesoid = (62.1 * altura) - 44.7;
			System.out.printf("%s, seu peso ideal é %.2f kg \n", nome, pesoid);
		}
	}

}
