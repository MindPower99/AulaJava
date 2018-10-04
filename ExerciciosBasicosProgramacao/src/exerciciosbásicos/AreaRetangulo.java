package exerciciosbásicos;
import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double base, altura, area;
		System.out.println("Digite o valor da base do Retângulo: ");
		base = input.nextDouble();
		System.out.println("Digite o valor da alturo do Retângulo: ");
		altura = input.nextDouble();
		area = base * altura;
		System.out.println("O valor da area do retângulo é "+area);
	}

}
