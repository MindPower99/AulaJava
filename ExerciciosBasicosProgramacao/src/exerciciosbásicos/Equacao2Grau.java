package exerciciosb�sicos;
import java.util.Scanner;


public class Equacao2Grau {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a,b,c,
		delta, sqrtdelta, raiz1, raiz2;
		
		System.out.println("Equa��o de 2� Grau: ax� + bx + cx = 0 \n");
		System.out.println("Entre com o valor de a: \n");
		a = input.nextDouble();
		System.out.println("Entre com o valor de b: \n");
		b = input.nextDouble();
		System.out.println("Entre com o valor de c: \n");
		c = input.nextDouble();
		
		if (a != 0) {
			
			delta = Math.pow(b, b) - (4*a*c);
			sqrtdelta = Math.sqrt(delta);			
		
		
			if (delta >= 0) {
				raiz1 = (-b + sqrtdelta) / (2*a);
				raiz2 = (-b - sqrtdelta) / (2*a);
				System.out.printf("Ra�zes: %.2f e %.2f \n",raiz1, raiz2);
			}
			
			else {
				
				delta = -delta;
				sqrtdelta = Math.sqrt(delta);
				System.out.printf("Raiz 1: %.2f e %.2f\n",(-b)/(2*a), (sqrtdelta)/(2*a));
				System.out.printf("Raiz 1: %.2f e %.2f\n",(-b)/(2*a), (-sqrtdelta)/(2*a));
				
			}
				
		}
		else 
			System.out.println("Coeficiente 'a' inv�lido. N�o pe uma equa��o do 2� grau \n");
	}

}
