package exerciciosbásicos;

public class ContaPoupanca {

	public static void main(String[] args) {
		double deposito;
		deposito = 500;
		System.out.printf("Primeiro mês R$ %.2f \n",deposito);
		deposito = (0.01 * deposito) + deposito;
		System.out.printf("Segundo mês R$ %.2f \n",deposito);
		deposito = (0.01 * deposito) + deposito;
		System.out.printf("Terceiro mês R$ %.2f \n",deposito);
		deposito = (0.01 * deposito) + deposito;
		System.out.printf("Quarto mês R$ %.2f \n",deposito);
		

	}

}
