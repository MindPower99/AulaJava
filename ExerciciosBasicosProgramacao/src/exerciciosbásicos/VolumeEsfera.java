package exerciciosb�sicos;
import java.util.Scanner;

public class VolumeEsfera {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double raio,volume;
		System.out.println("============ C�lculo de Volume de esfera: ==============");
		System.out.println("Digite o valor do raio em cent�metros: ");
		raio = input.nextDouble();
		volume = 4 * 3.14 * (Math.pow(raio,3)) / 3;
		System.out.printf("O volume da esfera � : %.2f cm�\n",volume);
	}

}
