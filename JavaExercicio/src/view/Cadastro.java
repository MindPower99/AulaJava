package view;

public class Cadastro {
	public static void main (String args[]) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Gabriel");
		pessoa.setEndereco("Rua dos bobos");
		pessoa.setBairro("Jardim nelia");
		pessoa.setCep("845465132");
		pessoa.setCpf("25131221451");
		pessoa.setIdade("19");
		pessoa.setRg("354131321");
		
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEndereco());
		System.out.println(pessoa.getBairro());
		System.out.println(pessoa.getCep());
		System.out.println(pessoa.getCpf());
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa.getRg());
	}
}
