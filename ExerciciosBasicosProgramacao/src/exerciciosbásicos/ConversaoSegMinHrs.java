package exerciciosbásicos;
import java.util.Scanner;

public class ConversaoSegMinHrs {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double seg, min, hrs;
		System.out.println("Números de segundos: ");
		seg = input.nextDouble();
		min = seg / 60;
		hrs = seg / 3600;
		System.out.printf("Convertido em Minutos: %.2f \n",min);
		System.out.printf("Convertido em horas: %.2f \n",hrs);

	}

}
