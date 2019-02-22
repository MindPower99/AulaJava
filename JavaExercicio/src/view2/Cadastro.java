package view2;

public class Cadastro extends Pessoa{
	public static void main(String args[]) {
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setNome("Gabriel");
		pf.setEndereco("Rua dos bobinhos");
		pf.setBairro("Jd Aranha");
		pf.setCpf(351654524-122);
		
		pj.setRazaosocial("Empresa charlinha");
		pj.setEndereco("Rua dos besta");
		pj.setBairro("Jd Aranha");
		
		System.out.println(pf.getBairro());
		System.out.println(pf.getEndereco());
		System.out.println(pf.getNome());
		System.out.println(pf.getCpf());
		
		System.out.println(pj.getRazaosocial());
		System.out.println(pj.getBairro());
		System.out.println(pj.getEndereco());
		
		
		
	}
}
