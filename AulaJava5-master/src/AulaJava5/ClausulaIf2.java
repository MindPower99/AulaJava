package AulaJava5;

public class ClausulaIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 90;
		if (idade <= 12) {
			System.out.println("Criança");
		}
		else if (idade <= 19) {
			System.out.print("Adolescente");
		}
		else if ( idade <= 60) { 
			System.out.println("Adulto");
		}
		else {
			System.out.println("Idoso");
		}
	}

}
