package exerciciosbásicos;
import java.util.Scanner;

public class CalculoTintaResolvido {

	public static void main(String[] args) {
		Double alt, lar, quan1, quan2, custo, total, area;
		int op;
		Scanner input = new Scanner (System.in);
		System.out.println("Digite a altura da parede: ");
		alt = input.nextDouble();
		System.out.println("Digite a largura da parede: ");
		lar = input.nextDouble();
		area = lar * alt;
		quan1 = area / (3*3);
		quan2 = (area * 3) / (5 * 3);
		custo = (quan1 * 150) + (quan2 * 100);
		System.out.println("1 - A vista \n2 - Cheque");
		op = input.nextInt();
		if (op == 1) {
			total = custo - (custo * 0.10);
			System.out.printf("O valor é R$ %.2f",total);
		}
		else if (op == 2) {
			total = custo - (custo * 0.5);
			System.out.printf("O valor é R$ %.2f",total);
		}
		else
			System.out.printf("Digite uma opção válida");
	}

}
