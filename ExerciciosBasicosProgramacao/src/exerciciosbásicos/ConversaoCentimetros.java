package exerciciosbásicos;
import java.util.Scanner;

public class ConversaoCentimetros {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double cent, mil, metro, deci;
		System.out.println("Medida em centímetros: ");
		cent = input.nextDouble();
		mil = cent * 10;
		System.out.printf("Esta medida em milímetros é: %.2f \n",mil);
		metro = cent / 100;
		System.out.printf("Esta medida em metros é de %.2f \n",metro);
		deci = cent / 10;
		System.out.printf("Esta medida em decímetros é de %.2f \n",deci);
	}

}
