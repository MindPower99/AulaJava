package exerciciosb�sicos;
import java.util.Scanner;

public class ParouImpar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n, resto;
		System.out.println("Digite um n�mero: ");
		n = input.nextDouble();
		resto = n % 2;
		if (resto == 0)
			System.out.println("Este � um n�mero par !");
		
		else 
			System.out.println("Este � um n�mero impar !");
	}

}
