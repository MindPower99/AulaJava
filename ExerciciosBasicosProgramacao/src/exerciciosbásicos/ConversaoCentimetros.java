package exerciciosb�sicos;
import java.util.Scanner;

public class ConversaoCentimetros {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double cent, mil, metro, deci;
		System.out.println("Medida em cent�metros: ");
		cent = input.nextDouble();
		mil = cent * 10;
		System.out.printf("Esta medida em mil�metros �: %.2f \n",mil);
		metro = cent / 100;
		System.out.printf("Esta medida em metros � de %.2f \n",metro);
		deci = cent / 10;
		System.out.printf("Esta medida em dec�metros � de %.2f \n",deci);
	}

}
