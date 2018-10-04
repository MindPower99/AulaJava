package exerciciosbásicos;
import java.util.Scanner;
public class BemVindoSenhorouSenhora {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int sexo;
		System.out.println("Digite seu sexo: \n 1 - Feminino \n 2 - Masculino \n 3 - outro \n");
		sexo = input.nextInt();
		if (sexo == 1) {
			System.out.println("Bem Vinda Senhora ! ");
		}
		else if (sexo == 2) {
			System.out.println("Bem Vindo Senhor ! ");
		}
		else {
			System.out.println("Bem Vindx Senhxr !");
		}
	}

}
