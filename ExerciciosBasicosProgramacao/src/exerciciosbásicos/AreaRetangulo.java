package exerciciosb�sicos;
import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double base, altura, area;
		System.out.println("Digite o valor da base do Ret�ngulo: ");
		base = input.nextDouble();
		System.out.println("Digite o valor da alturo do Ret�ngulo: ");
		altura = input.nextDouble();
		area = base * altura;
		System.out.println("O valor da area do ret�ngulo � "+area);
	}

}
