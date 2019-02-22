package view2;

public class PessoaFisica extends Pessoa {
	private String nome;
	private long rg, cpf;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}
	
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	
	
	
}
