package exerciciosb�sicos;

public class ContaPoupanca {

	public static void main(String[] args) {
		double deposito;
		deposito = 500;
		System.out.printf("Primeiro m�s R$ %.2f \n",deposito);
		deposito = (0.01 * deposito) + deposito;
		System.out.printf("Segundo m�s R$ %.2f \n",deposito);
		deposito = (0.01 * deposito) + deposito;
		System.out.printf("Terceiro m�s R$ %.2f \n",deposito);
		deposito = (0.01 * deposito) + deposito;
		System.out.printf("Quarto m�s R$ %.2f \n",deposito);
		

	}

}
