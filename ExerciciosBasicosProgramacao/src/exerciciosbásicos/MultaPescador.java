package exerciciosbásicos;
import java.util.Scanner;

public class MultaPescador {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double multa, quantidade;
		System.out.println("===========Cálculo de multa de pescador ===========\n");
		System.out.println("Quilos pescados: ");
		quantidade = input.nextDouble();
		
		if(quantidade <= 50) {
			System.out.println("Quantidade permitida.");
		}
		else {
			multa = (quantidade - 50) * 4;
			System.out.printf("Quantidade acima da permitida, multa de R$ %.2f \n",multa);
		}
	}

}
