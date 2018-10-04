package exerciciosbásicos;
import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double base, altura, area;
		System.out.println("Digite o valor da base: ");
		base = input.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = input.nextDouble();
		area = base * altura / 2;
		System.out.println("O valor da area é de "+area);
	}

}
