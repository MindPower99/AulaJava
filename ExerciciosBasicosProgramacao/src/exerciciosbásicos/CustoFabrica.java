package exerciciosb�sicos;
import java.util.Scanner;

public class CustoFabrica {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double custocons, custofabr;
		System.out.println("Digite o custo de f�brica em R$ ");
		custofabr = input.nextDouble();
		if (custofabr > 10000.00) {
			custocons = (custofabr +(28*100/100)+(45*100/100))+custofabr;
			System.out.printf("O custo do consumidor � R$ %.2f \n",custocons);
		}
		else {
			custocons = (custofabr +(28*100/100)+(45*100/100))+custofabr;
			System.out.printf("O custo do consumidor � R$ %.2f \n",custocons);
		}
			
	}

}
