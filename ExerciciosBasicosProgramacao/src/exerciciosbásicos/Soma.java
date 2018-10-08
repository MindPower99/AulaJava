package exerciciosbásicos;
import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n1, n2, media;
		System.out.println("Digite o primeiro numero: \n");
		n1 = input.nextDouble();
		System.out.println("Digite outro numero parsa: \n");
		n2 = input.nextDouble();
		media = n1 + n2;
		System.out.printf("o resultado da soma é: %.2f ",media);

	}

}
